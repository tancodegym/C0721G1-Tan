package _02_bai2_Loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("Enter width: ");
                    int w = Integer.parseInt(input.nextLine());
                    System.out.println("Enter height: ");
                    int h = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < w; i++) {
                        for (int j = 0; j < h; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("Enter height: ");
                    int height = Integer.parseInt(input.nextLine());
                    int c = -1;
                    while (c != 0) {
                        System.out.println("Menu");
                        System.out.println("1.Triangle with top-left");
                        System.out.println("2.Triangle with top-right");
                        System.out.println("3.Triangle with bottom-left");
                        System.out.println("4.Triangle with bottom-right");
                        System.out.println("0. Exit");
                        System.out.println("Enter your choice: ");
                        c = Integer.parseInt(input.nextLine());
                        System.out.println();
                        switch (c) {
                            case 1:
                                for (int i = height; i > 0; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 0; i < height; i++) {
                                    for (int j = 0; j < height; j++) {
                                        if (j < i) {
                                            System.out.print(" ");
                                        } else {
                                            System.out.print("*");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= height; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = 0; i < height; i++) {
                                    for (int j = height - i; j > 0; j--) {
                                        System.out.print(" ");
                                    }
                                    for (int k = 1; k <= i + 1; k++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Chọn sai rồi, hãy chọn lại");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter height of triangle : ");
                    int height1 = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < height1; i++) {
                        for (int j = height1 - i; j > 0; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 + 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}
