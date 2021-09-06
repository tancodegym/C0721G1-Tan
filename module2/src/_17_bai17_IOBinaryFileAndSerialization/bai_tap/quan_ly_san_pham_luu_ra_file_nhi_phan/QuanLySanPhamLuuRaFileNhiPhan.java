package _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.*;
class ReadAndWriteFile{
    public static  List<SanPham> readDataFromFile(String path) {
        List<SanPham> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<SanPham>) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Read completed !");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
    public static void writeToFile(String path, List<SanPham> list) {
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
class RunMain {
    public static void main(String[] args) {
        MenuTimSanPham.mainMenu();
    }
}

class SanPham implements Serializable{
    private int maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private int gia;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String hangSanXuat, int gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String sanPhamToString() {
        return "Sản phẩm có " +
                "mã sản phẩm: " + getMaSanPham() +
                ", tên sản phẩm : " + getTenSanPham() +
                ", hãng sản xuất : " + getHangSanXuat() +
                ", giá : " + getGia();
    }
}

class QuanLySanPham {
    public static void hienThiSanPham(String path) {
        List<SanPham> listSanPham = ReadAndWriteFile.readDataFromFile(path);
        IdSanPhamCompartor idProductCompartor = new IdSanPhamCompartor();
        Collections.sort(listSanPham, idProductCompartor);
        for (SanPham sanPham : listSanPham) {
            System.out.println(sanPham.sanPhamToString());
        }
    }

    public static void themSanPham(String path) {
        List<SanPham> listSanPham = ReadAndWriteFile.readDataFromFile(path);
        Scanner input = new Scanner(System.in);
        int id = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập mã sản phẩm");
            id = Integer.parseInt(input.nextLine());
            flag = false;
            for (int i = 0; i < listSanPham.size(); i++) {
                if (listSanPham.get(i).getMaSanPham() == id) {
                    System.out.println("Mã sản phẩm đã tồn tại, vui lòng nhập lại mã khác");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập hãng sản xuất :");
        String producer = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = Integer.parseInt(input.nextLine());
        listSanPham.add(new SanPham(id, name, producer, price));
        System.out.println("Đã thêm thành công sản phẩm !");
        ReadAndWriteFile.writeToFile(path,listSanPham);
        hienThiSanPham(path);
    }

    public static void timSanPhamTheoID(String path) {
        List<SanPham> list = ReadAndWriteFile.readDataFromFile(path);
        Scanner input = new Scanner(System.in);
        int id = 0;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Nhập mã sản phẩm");
            id = Integer.parseInt(input.nextLine());
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaSanPham() == id) {
                    System.out.println("Đã tìm thấy sản phẩm !");
                    System.out.println(list.get(id - 1).sanPhamToString());
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.println("Mã sản phẩm không tồn tại, vui lòng nhập lại mã khác");
                flag = true;
            }
        }
    }

    public static void timSanPhamTheoTen(String path) {
        List<SanPham> list = ReadAndWriteFile.readDataFromFile(path);
        Scanner input = new Scanner(System.in);
        String tenSP;
        boolean flag = true;
        boolean check = true;
        int count = 0;
        List<SanPham> ketQua = new ArrayList<>();
        while (flag) {
            System.out.println("Nhập tên sản phẩm");
            tenSP = input.nextLine();
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getTenSanPham().equals(tenSP)) {
                    count++;
                    check = false;
                    ketQua.add(list.get(i));
                }
            }
            if (check) {
                System.out.println("Tên sản phẩm không tồn tại, vui lòng nhập lại tên khác");
                flag = true;

            }
        }
        int countKQ = 1;
        System.out.println("Đã tìm thấy " + count + " sản phẩm !");
        for (SanPham sanPham : ketQua) {
            System.out.println("Sản phẩm thứ " + countKQ + " là " + sanPham.sanPhamToString());
            countKQ++;
        }
    }

    public static void timSanPhamTheoHang(String path) {
        List<SanPham> list = ReadAndWriteFile.readDataFromFile(path);
        Scanner input = new Scanner(System.in);
        String hangSX;
        boolean flag = true;
        boolean check = true;
        int count = 0;
        List<SanPham> ketQua = new ArrayList<>();
        while (flag) {
            System.out.println("Nhập hãng sản xuất sản phẩm");
            hangSX = input.nextLine();
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getHangSanXuat().equals(hangSX)) {
                    count++;
                    check = false;
                    ketQua.add(list.get(i));
                }
            }
            if (check) {
                System.out.println("Hãng sản xuất sản phẩm không tồn tại, vui lòng nhập lại hãng sản xuất khác");
                flag = true;

            }
        }
        int countKQ = 1;
        System.out.println("Đã tìm thấy " + count + " sản phẩm !");
        for (SanPham sanPham : ketQua) {
            System.out.println("Sản phẩm thứ " + countKQ + " là " + sanPham.sanPhamToString());
            countKQ++;
        }
    }

    public static void timSanPhamTheoGia(String path) {
        List<SanPham> list = ReadAndWriteFile.readDataFromFile(path);
        Scanner input = new Scanner(System.in);
        double giaSP;
        boolean flag = true;
        boolean check = true;
        int count = 0;
        List<SanPham> ketQua = new ArrayList<>();
        while (flag) {
            System.out.println("Nhập giá sản phẩm");
            giaSP = Double.parseDouble(input.nextLine());
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getGia() == giaSP) {
                    count++;
                    check = false;
                    ketQua.add(list.get(i));
                }
            }
            if (check) {
                System.out.println("Giá sản phẩm không tồn tại, vui lòng nhập lại giá khác");
                flag = true;
            }
        }
        int countKQ = 1;
        System.out.println("Đã tìm thấy " + count + " sản phẩm !");
        for (SanPham sanPham : ketQua) {
            System.out.println("Sản phẩm thứ " + countKQ + " là " + sanPham.sanPhamToString());
            countKQ++;
        }
    }

    public static void suaSanPham(String path) {
        List<SanPham> list = ReadAndWriteFile.readDataFromFile(path);
        Scanner input = new Scanner(System.in);
        int id = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập mã sản phẩm");
            id = Integer.parseInt(input.nextLine());
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaSanPham() == id) {
                    System.out.println("Nhập tên sản phẩm bạn muốn sửa !");
                    String tenSP = input.nextLine();
                    list.get(i).setTenSanPham(tenSP);
                    System.out.println("Nhập hãng sản xuất bạn muốn sửa !");
                    String hangSX = input.nextLine();
                    list.get(i).setHangSanXuat(hangSX);
                    System.out.println("Nhập giá sản phẩm bạn muốn sửa");
                    int giaSP = Integer.parseInt(input.nextLine());
                    list.get(i).setGia(giaSP);
                    System.out.println("Đã sửa thành công sản phẩm có mã: " + id);
//                    hienThiSanPham();
                    break;
                }
                if (list.get(list.size() - 1).getMaSanPham() != id) {
                    System.out.println("Mã sản phẩm không tồn tại, vui lòng nhập lại mã khác");
                    flag = true;
                    break;
                }
            }
        }
        ReadAndWriteFile.writeToFile(path,list);
        hienThiSanPham(path);

    }

    public static void xoaSanPham(String path) {
        List<SanPham> list = ReadAndWriteFile.readDataFromFile(path);
        List<Integer> listID = new LinkedList<>();
        for(SanPham sanPham: list){
            listID.add(sanPham.getMaSanPham());
        }
        Scanner input = new Scanner(System.in);
        int id = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Nhập mã sản phẩm");
            id = Integer.parseInt(input.nextLine());
            flag = false;
            if (listID.indexOf(id) == -1) {
                System.out.println("Mã sản phẩm bạn nhập sai hoặc không tồn tại, vui lòng nhập lại !");
                flag = true;
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaSanPham() == id) {
                    list.remove(i);
                    System.out.println("Đã xóa sản phẩm có mã sản phẩm: " + id);
                    break;
                }

            }
            System.out.println("Đã xóa xong sản phẩm có mã :" + id);
            System.out.println(list.size());
            ReadAndWriteFile.writeToFile(path,list);
            System.out.println(list.size());
            hienThiSanPham(path);


        }
    }
}
class MenuTimSanPham {
    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter path : ");
        String path = input.nextLine();
        while (flag) {
            System.out.println("---Main Menu---");
            System.out.println("1. Thêm Sản Phẩm");
            System.out.println("2. Xóa Sản Phẩm");
            System.out.println("3. Sửa thông tin sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("0. Exit Menu");
            System.out.println("Nhập vào sự lựa chọn của bạn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    QuanLySanPham.themSanPham(path);
                    break;
                case 2:
                    QuanLySanPham.xoaSanPham(path);
                    break;
                case 3:
                    QuanLySanPham.suaSanPham(path);
                    break;
                case 4:
                    QuanLySanPham.hienThiSanPham(path);
                    break;
                case 5:
                    menu(input,path);
                    break;
                default:
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại!");
                    break;
            }
        }

    }
    public static  void menu(Scanner scanner, String path) {
        System.out.println("---Menu Tìm Sản Phẩm---\n"
                + "1. Tìm theo mã sản phẩm \n"
                + "2. Tìm theo tên\n"
                + "3. Tìm theo hãng sản xuất\n"
                + "4. Tìm theo giá \n"
                + "5. Main Menu");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                QuanLySanPham.timSanPhamTheoID(path);
                menu(scanner, path);
                break;
            case "2":
                QuanLySanPham.timSanPhamTheoTen(path);
                menu(scanner, path);
                break;
            case "3":
                QuanLySanPham.timSanPhamTheoHang(path);
                menu(scanner, path);
                break;
            case "4":
                QuanLySanPham.timSanPhamTheoGia(path);
                menu(scanner, path);
                break;
            case "5":
                RunMain.main(null);
            default:
                menu(scanner, path);
                break;
        }
    }}





//Cách 1: Dùng listID:
//                int id;
//                do{
//                    System.out.println("Nhập mã sản phẩm: ");
//                     id = Integer.parseInt(input.nextLine());
//                }while (listID.indexOf(id)!=-1);
//Cách 2: Dùng flag