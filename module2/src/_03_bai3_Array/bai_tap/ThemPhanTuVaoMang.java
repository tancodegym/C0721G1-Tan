package _03_bai3_Array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
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
        System.out.println("Nhập phần tử cần thêm");
        int them = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vị trí cần thêm");
        int vitri = Integer.parseInt(input.nextLine());
        if(vitri<=-1||vitri>array.length-1){
            System.out.println("Không thể thêm phần tử");
        }
        for(int i=0; i<array.length;i++){
            if(vitri==i){
                array[i+1]=array[i];
                array[i]=them;

            }
        }
        System.out.println("Mảng sau khi thêm có các phần tử là : ");
        for (int value : array) {
            System.out.println(value);
        }
    }
}
