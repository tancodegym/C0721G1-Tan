package _19_bai19_StringAndRegex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneNumber{
    public PhoneNumber() {
    }

    private static final String PHONENUMBER_REGEX = "^[\\(]+\\d{2,}+[\\)\\-\\(]+\\d{10}+[\\)]$";
    public boolean validatePhoneNumber(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
class PhoneNumbereTest{
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