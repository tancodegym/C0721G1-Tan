package bai_tap_them_ngay_13_09_2021.validate_ho_va_ten;

import java.util.Scanner;
import java.util.regex.Pattern;

// Các kỹ tự đầu tiên Họ, Tên, tên đệm in Hoa
//         + Phải có họ và tên, tên đệm có thể có nhiều, 1 hoặc không
//         + Ho, Tên, tên đệm cách nhau bởi 1 dấu cách
//         + Chỉ chứa các ký tự chữ
public class ValidateHoVaTen {

        private static final String HO_VA_TEN = "^[A-Z]{1}[a-z]+([ ][A-Z]{1}([a-z]*)+)*([ ]([A-Z]{1}([a-z])*))+";
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter Fullname: ");
            String email = input.nextLine();
            boolean isvalid = Pattern.matches(HO_VA_TEN,email);
            if(isvalid){
                System.out.println("Họ và tên hợp lệ ");
            }
            else{
                System.out.println("họ và tên không hợp lệ");
            }
        }
    }

