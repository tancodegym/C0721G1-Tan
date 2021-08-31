package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTapNhom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = Integer.parseInt(input.nextLine());
        int[] array = new int[n];
        for(int i =0; i<n;i++){
            System.out.println("Nhập vào phần tử thứ " +i+" của mảng:" );
            array[i]= Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng có các phần tử là : " + Arrays.toString(array));
//        for(int i=0;i<n;i++){
//            System.out.println(array[i]);
//        }
        int max = array[0];
        int vitri = 1;
        for (int j = 0; j < array.length; j++) {
            if (max<array[j]) {
                max = array[j];
                vitri = j ;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là" + max + " , tại vị trí thứ " + vitri);
        int index_del=0;
        for(int i=0;i<array.length;i++){
            if( max==array[i]){
                index_del =i;
            }
        }
        for(int j = index_del;j<array.length-1;j++){
            array[j]=array[j+1];
        }
        array[array.length-1]=0;
        int max2 = array[0];
        int vitri1 = 1;
        for (int j = 0; j < array.length; j++) {
            if (max2<array[j] && max != array[j]  ) {
                max2 = array[j];
                vitri1 = j ;
            }
        }
        System.out.println("Phần tử lớn thứ 2 của mảng là" + max2 + " , tại vị trí thứ " + vitri1);

    }
}


//Sắp xếp mảng từ nhỏ đến lớn:
//        int[] a = {1,9,3,2};
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] > a[j]){
//                    int x = a[i];
//                    a[i] = a[j];
//                    a[j] = x;
//                }
//            }
//        }


//Sắp xếp mảng từ lớn tới nhỏ:
//        int[] a = {1,9,3,2};
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] < a[j]){
//                    int x = a[i];
//                    a[i] = a[j];
//                    a[j] = x;
//                }
//            }
//        }
//        for(int j=0; j<a.length;j++){
//            System.out.println(a[j]);
//        }
//    }

