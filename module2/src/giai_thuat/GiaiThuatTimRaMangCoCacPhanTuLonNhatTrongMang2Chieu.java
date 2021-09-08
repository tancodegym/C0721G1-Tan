package giai_thuat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GiaiThuatTimRaMangCoCacPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của ma trận: ");
        n = Integer.parseInt(scanner.nextLine());
        int A[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.toString(FindMax.findMax(A,m,n)));

    }
    static class FindMax{
    public static int[] findMax(int[][] ints,int x, int y){
        int [] maxArray= new int[4];
        for (int i = 0; i < x; i++) {
            int max = ints[i][0];
            for (int j = 0; j < y; j++) {
                if (max < ints[i][j]) {
                    max = ints[i][j];
                }
            }
            maxArray[i]=max;
        }
        return maxArray;

    }}
}
