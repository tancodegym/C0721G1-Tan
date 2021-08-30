package _11_bai11_DSAStackAndQueue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KiemTraChuoiPalindromeSuDungQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String string = input.nextLine();
        Queue queue = new LinkedList();
        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (string.equals(reverseString))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}


