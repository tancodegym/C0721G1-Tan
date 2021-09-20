package _bai_tap_them.bai_tap_them_ngay_13_09_2021.validate_email;

import java.util.Scanner;

import java.util.regex.Pattern;

//+ Có ít nhất 8 ký tự
//        +ký tự đầu tiên in thường
//        +Có thể chứa chữ và số
//        +Có thể có 1 ký tự "." nhưng không được đặt ở đầu hoặc cuối email
//        +Phải có 1 ký tự @,
//        + Sau@xxx.yyy hoặc @xxx.yyy.zzz ( số lượng x,y,z  {2,5} (edited)
class ValidateEmail {
    private static final String EMAIL_REGEX = "(^[a-z]([\\w\\.])*+@([\\w]{2,5}+\\.[\\w]{2,5}+|[\\w]{2,5}+\\.[\\w]{2,5}\\.[\\w]{2,5}))";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Email: ");
        String email = input.nextLine();
        boolean isvalid =Pattern.matches(EMAIL_REGEX,email);
        if(isvalid){
            System.out.println("Email hợp lệ ");
        }
        else{
            System.out.println("Email không hợp lệ");
        }
    }
}




