package _03_bai3_Array.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = Integer.parseInt(input.nextLine());
        int[] array = new int[n];
        for(int i =0; i<n;i++){
            System.out.println("Nhập vào phần tử thứ " +i+" của mảng:" );
            array[i]= Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng có các phần tử là : ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        int min = array[0];
        int vitri = 1;
        for (int j = 0; j < array.length; j++) {
            if (min>array[j]) {
                min = array[j];
                vitri = j ;
            }
        }
        System.out.println("Phần tử nhỏ nhất của mảng là" + min + " , tại vị trí thứ " + vitri);
    }
}
