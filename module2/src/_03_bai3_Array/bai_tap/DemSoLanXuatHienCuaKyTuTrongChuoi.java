package _03_bai3_Array.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kì");
        String string = input.nextLine();
        System.out.println("Nhập vào kí tự bạn cần tìm trong chuỗi trên");
        char c = input.nextLine().charAt(0);
        int count = 0;
        int h = string.length();
        for (int i = 0; i < h; i++) {
            if (string.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự: " + c + " trong chuỗi: " + string + " là: " + count);
    }
}
