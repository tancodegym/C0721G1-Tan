package _01_bai1_Introduction.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số USD bạn cần chuyển: ");
        int usd =sc.nextInt();
        System.out.println("Số VNĐ bạn nhận được là : " +usd*rate);
    }
}
