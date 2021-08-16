package _02_bai2_Loop.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            if (checkSNT(N)) {
                System.out.println(N);
            }
            N++;
        }
    }
    public static boolean checkSNT (int N) {
        boolean check = true;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
