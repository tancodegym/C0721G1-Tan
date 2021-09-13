package _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import _case_study.view.RunMain;

import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
         String path="src\\_17_bai17_IOBinaryFileAndSerialization\\bai_tap\\quan_ly_san_pham_luu_ra_file_nhi_phan\\sanpham.csv";
        while (true) {
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

