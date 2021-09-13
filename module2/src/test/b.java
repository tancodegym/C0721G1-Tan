package test;

import java.util.Scanner;

class Configs {

    // Loại nhân viên
    public static final int NHAN_VIEN_SEP = 1;
    public static final int NHAN_VIEN_LINH = 2;

    // Lương nhân viên
    public static final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000; // Lương tháng của sếp
    public static final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000; // Lương tháng của lình
    public static final long LUONG_LAM_THEM_MOI_NGAY = 800000; // Làm thêm mỗi ngày của nhân viên toàn thời gian được 800 k
    public static final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000; // Lương nhân viên thời vụ mỗi giờ 100 k
}

abstract class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {

    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    // Lớp con phải override để lo vụ loại nhân viên này
    protected abstract String loaiNhanVien();

    // Lớp con phải override để lo vụ tính lương này
    public abstract void tinhLuong();

    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + ten + " =====");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}
class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    protected String loaiNhanVien() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            return "Lính toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)" : "");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)" : "");
        }
    }

    @Override
    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
 class NhanVienPartTime extends NhanVien {
     private int gioLamViec;
     NhanVienPartTime(String ten,int gioLamViec){
         this.ten=ten;
         this.gioLamViec=gioLamViec;
     }
     @Override
     protected String loaiNhanVien() {
         return "Nhân viên thời vụ";
     }

     @Override
     public void tinhLuong() {
         luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
     }
 }
 class MainClass {
     public static void main(String[] args) {
         // Kêu người dùng nhập vào số lượng nhân viên trong công ty
         Scanner scanner = new Scanner(System.in);
         System.out.print("Hãy nhập số lượng nhân viên: ");
         int tongNhanVien = Integer.parseInt(scanner.nextLine());

         // Khai báo mảng các nhân viên
         NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
         for (int i = 0; i < tongNhanVien; i++) {
             // Khai báo từng loại nhân viên, và kêu người dùng nhập thông tin nhân viên
             System.out.print("Tên nhân viên " + (i + 1) + ": ");
             String ten = scanner.nextLine();
             System.out.print("Là nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
             int laNhanVien = Integer.parseInt(scanner.nextLine());
             if (laNhanVien == 1) {
                 // Nhân viên toàn thời gian
                 System.out.print("Chức vụ nhân viên (1-Sếp; 2-Lính): ");
                 int chucVu = Integer.parseInt(scanner.nextLine());
                 System.out.print("Ngày làm thêm (nếu có): ");
                 int ngayLamThem = Integer.parseInt(scanner.nextLine());
                 mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
             } else {
                 System.out.print("Giờ làm: ");
                 int gioLamViec = Integer.parseInt(scanner.nextLine());
                 mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
             }
         }

         System.out.println("\nKết quả tính lương\n");

         // Tính lương và xuất thông tin nhân viên
         for (NhanVien nhanVien : mangNhanVien) {
             nhanVien.tinhLuong();
             nhanVien.xuatThongTin();
         }
     }
 }