package _03_bai3_Array.bai_tap;

import sun.security.rsa.RSAUtil;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận vuông");
        int n = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[n][n];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Ma trận đã nhập vào là: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập vào cột cần tính tổng");
        int c = Integer.parseInt(input.nextLine());
        int total = 0;
        if (c < 0 || c > matrix.length) {
            System.out.println("Không thể tính được tổng của cột không có trong ma trận");
        } else {
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][c];
            }

        }
        System.out.println("Tổng các phần tử ở cột thứ"+c+ " là " + total);
    }
}

