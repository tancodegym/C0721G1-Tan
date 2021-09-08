package _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class QuanLySanPham {
    String path="src\\_17_bai17_IOBinaryFileAndSerialization\\bai_tap\\quan_ly_san_pham_luu_ra_file_nhi_phan\\sanpham.csv";


    public static void hienThiSanPham(String path) {
       List<SanPham> listSanPham = ReadAndWriteFile.readDataFromFile(path);
        IdSanPhamCompartor idProductCompartor = new IdSanPhamCompartor();
        Collections.sort(listSanPham, idProductCompartor);
        for (SanPham sanPham : listSanPham) {
            System.out.println(sanPham.toString());
        }
    }
    public static void themSanPham(String path) {

//        List<SanPham> listSanPham = new ArrayList<>();
//        listSanPham.add(new SanPham(1,"A","b",555));
//        ReadAndWriteFile.writeToFile(path,listSanPham);
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
                    System.out.println(list.get(id - 1).toString());
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
            System.out.println("Sản phẩm thứ " + countKQ + " là " + sanPham.toString());
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
            System.out.println("Sản phẩm thứ " + countKQ + " là " + sanPham.toString());
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
            System.out.println("Sản phẩm thứ " + countKQ + " là " + sanPham.toString());
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
