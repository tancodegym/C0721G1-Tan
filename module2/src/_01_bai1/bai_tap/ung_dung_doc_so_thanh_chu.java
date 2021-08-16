package _01_bai1.bai_tap;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Chương trình chưa đọc được ");
        }
        if (n < 14) {
            switch (n) {
                case 0:
                    System.out.println("Zero");
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");
                case 3:
                    System.out.println("Three");
                case 4:
                    System.out.println("Four");
                case 5:
                    System.out.println("Five");
                case 6:
                    System.out.println("Six");
                case 7:
                    System.out.println("Seven");
                case 8:
                    System.out.println("Eight");
                case 9:
                    System.out.println("Nine");
                case 10:
                    System.out.println("Ten");
                case 11:
                    System.out.println("Eleven");
                case 12:
                    System.out.println("Twelve");
                case 13:
                    System.out.println("Thirteen");
            }
        }
        if (n < 20) {
            int x = n % 10;
            switch (x) {
                case 4:
                    System.out.println("Fourteen");
                case 5:
                    System.out.println("Fifteen");
                case 6:
                    System.out.println("Sixteen");
                case 7:
                    System.out.println("Seventeen");
                case 8:
                    System.out.println("Eighteen");
                case 9:
                    System.out.println("Nineteen");
            }
            if (n < 100) {
                {
                    int hangChuc = n / 10;
                    int hangDonVi = (n % 10) % 10;
                    System.out.println(hangChuc);
                    System.out.println(hangDonVi);
                    String chuc = "";
                    switch (hangChuc) {
                        case 2:
                            chuc += "twenty";
                        case 3:
                            chuc += "thirty";
                        case 4:
                            chuc += "fourty";
                        case 5:
                            chuc += "fifty";
                        case 6:
                            chuc += "sixty";
                        case 7:
                            chuc += "seventy";
                        case 8:
                            chuc += "eighty";
                        case 9:
                            chuc += "ninety";
                    }
                    switch (hangDonVi) {
                        case 0:
                            chuc += "";
                        case 1:
                            chuc += "one";
                        case 2:
                            chuc += "two";
                        case 3:
                            chuc += "three";
                        case 4:
                            chuc += "four";
                        case 5:
                            chuc += "five";
                        case 6:
                            chuc += "six";
                        case 7:
                            chuc += "seven";
                        case 8:
                            chuc += "eight";
                        case 9:
                            chuc += "nine";
                    }
                    System.out.println(chuc);

                }
            }
        }
    }}
