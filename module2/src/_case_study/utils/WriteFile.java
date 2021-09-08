package _case_study.utils;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    public static <E> void writeToFile(String path, List<E> list) {
        try {
            System.out.println(list.size());
            FileOutputStream fos = new FileOutputStream(path,false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
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
