package _13_bai13_ThuatToanTimKiem.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaiDatThuatToanTimKiemNhiPhanSuDungDeQuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of array");
        int numberOfArrays = Integer.parseInt(input.nextLine());
        int[] array = new int[numberOfArrays];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter number of index : " +i);
            array[i]= Integer.parseInt(input.nextLine());
        }
        List<Integer> intList = new ArrayList<>();
        for(int i =0;i<array.length;i++){
            intList.add(array[i]);
        }
        intList.sort((o1, o2) -> o1-o2);
        System.out.println("Enter value you want to search");
        int value = Integer.parseInt(input.nextLine());
        int index= BinarySearch.binarySearch(intList,0,intList.size()-1,value);
        if(index!=-1){
            System.out.println("The value you want to find is in the array");
        }
        else {
            System.out.println("The value you were looking for was not found");

        }
    }
   public static class BinarySearch{
   public static int binarySearch(List<Integer> arr, int left, int right, int value){
        if(left<right){
            int middle = left+(right-left)/2;
            if(arr.get(middle) ==value){
                return middle;
            }
             if(arr.get(middle) <value){
                return binarySearch(arr,middle+1,right,value);
            }
            if (arr.get(middle) >value){
                return binarySearch(arr,left,right-1,value);
            }
        }
        return -1;
    }
}}
