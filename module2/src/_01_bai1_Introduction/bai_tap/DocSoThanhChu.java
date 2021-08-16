package _01_bai1_Introduction.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static String donVi (int number) {
        String str = "";
        switch (number) {
            case 0:
                str = "";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str= "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }
    public static String hangChuc (int number) {
        int num = number / 10;
        int num1 = number % 10;
        String str = "";
        switch (num) {
            case 1:
                switch (num1) {
                    case 0:
                        str = "ten";
                        break;
                    case 1:
                        str = "eleven";
                        break;
                    case 2:
                        str = "twelve";
                        break;
                    case 3:
                        str = "thirteen";
                        break;
                    default:
                        str = donVi(num1) + "teen";
                        break;
                }
                break;
            case 2:
                str = "twenty" + donVi(num1);
                break;
            case 3:
                str = "thirty" + donVi(num1);
                break;
            case 5:
                str = "fifty" + donVi(num1);
                break;
            default:
                str = donVi(num) + "ty" + donVi(num1);

        }
        return str;
    }
    public static String hangTram (int number) {
        int num = number / 100;
        int num1 = number % 100;
        String str = "";
        if (num1 == 0 && num > 0) {
            str = donVi(num) + " hundred";
        } else if (num1 >= 0 && num1 <= 9 && num > 0){
            str = donVi(num) + " hundred and " + donVi(num1);
        } else {
            str = donVi(num) + " hundred and " + hangChuc(num1);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            System.out.println("number nhỏ hơn 0, chương trình chưa đọc được");
        } else if (number == 0){
            System.out.println("Zero");
        } else if (number > 0 && number <= 9) {
            System.out.println(donVi(number));
        } else if (number >= 10 && number < 100) {
            System.out.println(hangChuc(number));
        } else if (number >= 100 && number < 1000) {
            System.out.println(hangTram(number));
        } else {
            System.out.println("number lớn hơn 1000, chương trình không thể đọc");
        }
    }
}
