package _bai_tap_them.test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao do dai mang :");
        size = Integer.parseInt(input.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap vao phan tu thu :" + i);
            array[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        int index_del = 0;
        System.out.println("nhap gia tri can xoa");
        int a = Integer.parseInt(input.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                index_del = i;
                System.out.println("phan tu can xoa là" + array[i] + "tai vi tri" + index_del);
            }
        }
        for (int j = index_del; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        System.out.println("mang sau khi xoa:");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.println(array[j]);
        }
    }
}