package _03_bai3_Array.bai_tap;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên :");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 30)
                System.out.println("Số lượng sinh viên phải nhỏ hơn 30 ");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập vào điểm của sinh viên thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm của sinh viên: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("Số lượng sinh viên thi đỗ là:  " + count);
    }
}
