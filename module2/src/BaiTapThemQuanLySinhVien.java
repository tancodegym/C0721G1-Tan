
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Tìm thông tin sinh viên");
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
                    QuanLySinhVien.xoaSinhVien();
                    break;
                case 3:
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
        sinhViens[0] = new SinhVien(null, 0, "ABC", 25, "C0721G1");
//
    }

    public static void themSinhVien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần thêm:");
        String tenSinhVien = input.nextLine();
        System.out.println("Nhập tuổi sinh viên trên");
        int tuoiSinhVien = Integer.parseInt(input.nextLine());
        System.out.println("Nhập lớp sinh viên trên");
        String lopSinhVien = input.nextLine();
        System.out.println("Nhập số nhà:");
        String soNha = input.nextLine();
        System.out.println("Nhập tên đường");
        String tenDuong = input.nextLine();
        System.out.println("Nhập tên phường/xã:");
        String tenPhuong = input.nextLine();
        System.out.println("Nhập tên quận/huyện");
        String tenQuan = input.nextLine();
        System.out.println("Nhập tên tỉnh/thành phố:");
        String tenTinh = input.nextLine();
        DiaChi diaChi = new DiaChi(soNha, tenDuong, tenPhuong, tenQuan, tenTinh);
        SinhVien sv = new SinhVien(diaChi, 0, tenSinhVien, tuoiSinhVien, lopSinhVien);
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
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien == null) {
                System.out.println("Bạn nhập sai id hãy thực hiện lại");
                break;
            }
            if (id == sinhVien.getId()) {
                System.out.println("Nhập tên sinh viên bạn muốn sửa");
                String tenSinhVienMuonSua = input.nextLine();
                System.out.println("Nhập tuổi sinh viên đó:");
                int tuoiSinhVienMuonSua = Integer.parseInt(input.nextLine());
                System.out.println("Nhập lớp sinh viên muốn sửa");
                String lopSinhVienMuonSua = input.nextLine();
                System.out.println("Nhập số nhà:");
                String soNha = input.nextLine();
                System.out.println("Nhập tên đường");
                String tenDuong = input.nextLine();
                System.out.println("Nhập tên phường/xã:");
                String tenPhuong = input.nextLine();
                System.out.println("Nhập tên quận/huyện");
                String tenQuan = input.nextLine();
                System.out.println("Nhập tên tỉnh/thành phố:");
                String tenTinh = input.nextLine();
                DiaChi diaChi = new DiaChi(soNha, tenDuong, tenPhuong, tenQuan, tenTinh);
                sinhVien.setTen(tenSinhVienMuonSua);
                sinhVien.setTuoi(tuoiSinhVienMuonSua);
                sinhVien.setTenLop(lopSinhVienMuonSua);
                sinhVien.setDiaChi(diaChi);

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
                System.out.println(Arrays.toString(sinhViens));
                System.out.println("ID: " + sinhVien.getId());
                System.out.println("Tên Sinh viên: " + sinhVien.getTen());
                System.out.println("Tuổi :" + sinhVien.getTuoi());
                System.out.println("Lớp: " + sinhVien.getTenLop());
                System.out.println("Địa chỉ: " + sinhVien.getDiaChi());
            }
        }
    }

    public static void hienThiSinhVien() {
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien != null) {
                System.out.println(sinhVien);
                System.out.println("ID: " + sinhVien.getId());
                System.out.println("Tên Sinh viên: " + sinhVien.getTen());
                System.out.println("Tuổi :" + sinhVien.getTuoi());
                System.out.println("Lớp: " + sinhVien.getTenLop());
                System.out.println("Địa chỉ: " + sinhVien.getDiaChi());
            }
        }
    }
}

class DiaChi {
    private static String soNha;
    private static String tenDuong;
    private static String tenPhuong;
    private static String tenQuan;
    private static String tenTinh;

    public DiaChi() {
    }

    public DiaChi(String soNha, String tenDuong, String tenPhuong, String tenQuan, String tenTinh) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
        this.tenPhuong = tenPhuong;
        this.tenQuan = tenQuan;
        this.tenTinh = tenTinh;
    }


    public static String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public static String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public static String getTenPhuong() {
        return tenPhuong;
    }

    public void setTenPhuong(String tenPhuong) {
        this.tenPhuong = tenPhuong;
    }

    public static String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public static String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

}

class SinhVien {
    private int id;
    private String ten;
    private int tuoi;
    private String tenLop;
    private DiaChi diaChi;

    public SinhVien() {

    }

    public SinhVien(DiaChi diaChi, int id, String ten, int tuoi, String tenLop) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.tenLop = tenLop;
        this.diaChi = diaChi;

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

    public String getDiaChi() {
        return "Địa chỉ tại số nhà: " + DiaChi.getSoNha() +
                ", tên đường: " + DiaChi.getTenDuong() +
                ", tên phường: " + DiaChi.getTenPhuong() +
                ", tên quận: " + DiaChi.getTenQuan() +
                ", tên tỉnh: " + DiaChi.getTenTinh();
    }


    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
}