package _11_bai11_DSAStackAndQueue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuTrongMangSoNguyenBangStack {

        public static void main(String[] args) {
            Stack<Integer> stacks = new Stack<>();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number length of array");
            int numberOfLength=Integer.parseInt(input.nextLine());
            int[] integerArray = new int[numberOfLength];
            for(int i=0;i<numberOfLength;i++){
                System.out.println("Enter number of index :"+i);
                int number= Integer.parseInt(input.nextLine());
                integerArray[i]=number;
            }
            for(int i=0;i<integerArray.length;i++){
                stacks.push(integerArray[i]);
            }
            int[] newIntegerArray= new int[numberOfLength];
            for(int i=0;i<newIntegerArray.length;i++){
                newIntegerArray[i]=stacks.pop();
            }
            System.out.println("Array input");
            System.out.println(Arrays.toString(integerArray));
            System.out.println("Array after reverse by stack");
            System.out.println(Arrays.toString(newIntegerArray));
        }}

