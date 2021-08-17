package _03_bai3_Array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
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
        System.out.println("Nhập phần tử cần xóa");
        int x = Integer.parseInt(input.nextLine());
        int index_del=0;
        for(int i=0;i<array.length;i++){
            if( x==array[i]){
                index_del =i;
                System.out.println("Phần tử cần xóa có trong mảng là: " + array[i]+" có vị trí là " + index_del);

            }
        }
        for(int j = index_del;j<array.length-1;j++){
            array[j]=array[j+1];
        }
        array[array.length-1]=0;
        System.out.println("Mảng sau khi xóa có các phần tử là : ");
        for (int value : array) {
            System.out.println(value);
        }

    }
}
