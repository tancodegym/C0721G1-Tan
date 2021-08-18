package _03_bai3_Array.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Size shoudn't exceed");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + i + ":");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        System.out.println("Property list : ");
        for (int value : array) {
            System.out.println(value);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
