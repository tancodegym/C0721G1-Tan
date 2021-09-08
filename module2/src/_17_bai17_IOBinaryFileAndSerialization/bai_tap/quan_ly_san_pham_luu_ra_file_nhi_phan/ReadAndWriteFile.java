package _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<SanPham> readDataFromFile(String path) {
        List<SanPham> sanPhamList = new ArrayList<>();
        File f = new File(path);
        if (f.length() > 0) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                sanPhamList = (List<SanPham>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("Read completed !");

            } catch (FileNotFoundException fileNotFoundException) {

            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            return sanPhamList;

        } else {
            return sanPhamList;
        }
    }
    public static void writeToFile(String path, List<SanPham> list) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            System.out.println("Write compeleted !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


