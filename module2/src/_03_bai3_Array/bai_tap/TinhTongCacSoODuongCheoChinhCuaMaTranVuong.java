package _03_bai3_Array.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận vuông");
        int n = Integer.parseInt(input.nextLine());
        int [][] matrix=new int[n][n];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.println("Ma trận đã nhập vào là: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int total=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
               if(row == column){
                   total = total+ matrix[row][column];
               }
            }

        }
        System.out.println("Tổng các phần tử đường chéo chính là: " +total);
    }
}
