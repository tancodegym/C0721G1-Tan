package _02_bai2_Loop.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố cần in ra : ");
        int numbers = Integer.parseInt(input.nextLine());
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (checkSNT(N)) {
                System.out.println(N);
                count++;
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
