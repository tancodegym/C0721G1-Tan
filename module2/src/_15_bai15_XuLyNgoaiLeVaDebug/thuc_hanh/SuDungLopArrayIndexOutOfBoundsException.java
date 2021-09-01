package _15_bai15_XuLyNgoaiLeVaDebug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class SuDungLopArrayIndexOutOfBoundsException {
    static class ArrayExample {
        public Integer[] createRandom() {
            Random random = new Random();
            Integer[] array = new Integer[100];
            System.out.println("List element of array: ");
            for (int i = 0; i < 100; i++) {
                array[i] = random.nextInt(100);
                System.out.println("Element " + i + " : " + array[i]);
            }
            return array;
        }

        public static void main(String[] args) {
            ArrayExample arrayExample= new ArrayExample();
            Integer[] array = arrayExample.createRandom();
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter index of element: ");
            while(true){

            int index = Integer.parseInt(input.nextLine());

            try {
                System.out.println("Value of element with index : "+index+ " is :"+array[index]);
            }
            catch (IndexOutOfBoundsException e){
                System.err.println("Index exceeds the limit of the array");
            }
                System.out.println("Please enter index of element: ");
        }}
    }
}