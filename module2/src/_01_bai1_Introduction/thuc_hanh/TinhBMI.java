package _01_bai1_Introduction.thuc_hanh;

import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập vào số cân của bạn(kg)");
        weight = scanner.nextDouble();
        System.out.print("Nhập vào chiều cao của bạn(m)");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Tình trạng\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Dư cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
