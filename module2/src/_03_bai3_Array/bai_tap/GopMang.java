package _03_bai3_Array.bai_tap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng thứ 1: ");
        int n1 = Integer.parseInt(input.nextLine());
        int[] array1 = new int[n1];
        for(int i =0; i<n1;i++){
            System.out.println("Nhập vào phần tử thứ " +i+" của mảng thứ 1:" );
            array1[i]= Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng thứ 1 có các phần tử là : ");
        for(int i=0;i<n1;i++){
            System.out.println(array1[i]);
        }
        System.out.println("Nhập vào số phần tử của mảng thứ 2: ");
        int n2 = Integer.parseInt(input.nextLine());
        int[] array2 = new int[n2];
        for(int i =0; i<n2;i++){
            System.out.println("Nhập vào phần tử thứ " +i+" của mảng thứ 2:" );
            array2[i]= Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng thứ 2 có các phần tử là : ");
        for(int i=0;i<n1;i++){
            System.out.println(array2[i]);
        }
        int n3 = n1+n2;
        int[] array3 = new int[n3];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        System.out.println("Mảng sau khi gộp có các phần tử là: ");
        for(int i=0; i<array3.length;i++){
            System.out.println(array3[i]);

        }

    }
}
