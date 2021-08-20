
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4.Hiển thị danh sách sinh viên");
            System.out.println("5.Tìm thông tin sinh viên");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào số bạn chọn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    QuanLySinhVien.themSinhVien();
                    break;
                case 2:
//                    System.out.println("Chức năng đang cập nhập chưa dùng được !");
                    QuanLySinhVien.xoaSinhVien();
                    break;
                case 3:
//                    System.out.println("Chức năng đang cập nhập nên chưa dùng được !");
                    QuanLySinhVien.suaThongTinSinhVien();
                    break;
                case 4:
                    QuanLySinhVien.hienThiSinhVien();
                    break;
                case 5:
                    QuanLySinhVien.timThongTinSinhVien();
                    break;
                default:
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại !");
                    break;
            }
        }
    }
}

class QuanLySinhVien {
    static SinhVien[] sinhViens = new SinhVien[100];
    static {
        sinhViens[0] = new SinhVien("Học Sinh A", 18, "A", 1);
        sinhViens[1] = new SinhVien("Học Sinh B", 36, "B", 2);
        sinhViens[2] = new SinhVien("Học Sinh C", 72, "C", 3);
    }
    public static void themSinhVien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần thêm:");
        String tenSinhVien = input.nextLine();
        System.out.println("Nhập tuổi sinh viên trên");
        int tuoiSinhVien = Integer.parseInt(input.nextLine());
        System.out.println("Nhập lớp sinh viên trên");
        String lopSinhVien = input.nextLine();
        SinhVien sv = new SinhVien(tenSinhVien, tuoiSinhVien, lopSinhVien, 0);
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i] == null) {
                sinhViens[i] = sv;
                sinhViens[i].setId(i + 1);
                break;
            }
        }
    }

    public static void suaThongTinSinhVien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id sinh viên cần sửa");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sinh viên bạn muốn sửa");
        String tenSinhVienMuonSua = input.nextLine();
        System.out.println("Nhập tuổi sinh viên đó:");
        int tuoiSinhVienMuonSua = Integer.parseInt(input.nextLine());
        System.out.println("Nhập lớp sinh viên muốn sửa");
        String lopSinhVienMuonSua = input.nextLine();
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien == null) {
                System.out.println("Bạn nhập sai id hãy thực hiện lại");
                break;
            }
            if (id == sinhVien.getId()) {
                sinhVien.setTen(tenSinhVienMuonSua);
                sinhVien.setTuoi(tuoiSinhVienMuonSua);
                sinhVien.setTenLop(lopSinhVienMuonSua);
            }
        }
    }
    public static void xoaSinhVien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id sinh viên cần xóa");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i] == null) {
                break;
            }
            if (id == sinhViens[i].getId()) {
                for (int j = i; j < sinhViens.length; j++) {
                    sinhViens[i] = sinhViens[i + 1];
                }
                sinhViens[sinhViens.length - 1] = null;
            }
        }
    }
    public static void timThongTinSinhVien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id sinh viên cần tìm");
        int id = Integer.parseInt(input.nextLine());
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien == null) {
                System.out.println("Bạn nhập sai id hãy thực hiện lại");
                break;
            }
            if (id == sinhVien.getId()) {
                System.out.println("ID: " + sinhVien.getId());
                System.out.println("Tên Sinh viên: " + sinhVien.getTen());
                System.out.println("Tuổi :" + sinhVien.getTuoi());
                System.out.println("Lớp: " + sinhVien.getTenLop());
            }
        }
    }
    public static void hienThiSinhVien() {
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien != null) {
                System.out.println("ID: " + sinhVien.getId());
                System.out.println("Tên Sinh viên: " + sinhVien.getTen());
                System.out.println("Tuổi :" + sinhVien.getTuoi());
                System.out.println("Lớp: " + sinhVien.getTenLop());
            }
        }
    }


}
 class SinhVien {
    private int id;
    private String ten;
    private int tuoi;
    private String tenLop;

    public SinhVien(String ten, int tuoi, String tenLop, int id) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.tenLop = tenLop;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}