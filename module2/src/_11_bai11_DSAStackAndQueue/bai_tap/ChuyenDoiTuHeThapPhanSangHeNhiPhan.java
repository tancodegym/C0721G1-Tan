package _11_bai11_DSAStackAndQueue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiTuHeThapPhanSangHeNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> decimal = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= Integer.parseInt(input.nextLine());
        int temp=number;
        int count=0;
        while(number!=0){
           int x= number%2;
           decimal.push(x);
           number /= 2;
            count++;
        }
        String binary = "";
        for(int i=0;i<count;i++){
            binary+=decimal.pop();
        }
        System.out.println("Number input:" + temp);
        System.out.println("Number after change to binary is: " + binary);

    }
}
