package _19_bai19_StringAndRegex.bai_tap.validate_ten_lop;


import java.util.Scanner;

class ClassExampleTest {
    private static ClassExample classExample;

    public static void main(String[] args) {
        classExample = new ClassExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name class :");
        String nameClass = input.nextLine();
        boolean isvalid = classExample.validateClass(nameClass);
        if (isvalid) {
            System.out.println("Class name is valid !");
        } else {
            System.out.println("Class name is invalid !");
        }

    }
}