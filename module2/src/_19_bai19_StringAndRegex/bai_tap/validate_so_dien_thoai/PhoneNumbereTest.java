package _19_bai19_StringAndRegex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

class PhoneNumbereTest {
    private static PhoneNumber phoneNumber;

    public static void main(String[] args) {
        phoneNumber= new PhoneNumber();
        System.out.println("Enter your phone number: ");
        Scanner input = new Scanner(System.in);
        String phoneNum = input.nextLine();
        boolean isvalid = phoneNumber.validatePhoneNumber(phoneNum);
        if (isvalid) {
            System.out.println("Class name is valid !");
        } else {
            System.out.println("Class name is invalid !");
        }
    }
}