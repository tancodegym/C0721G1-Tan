import _01_bai1_Introduction.thuc_hanh.GiaiPhuongTrinhBac1;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class GiaiThuatThu3 {
    static String[] findString(String str) {
        String[] result = new String[str.length()];
        if (str.length() > 0) {
            result[0] = String.valueOf(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) != str.charAt(j)) {
                        for (int k = j; k >= 0; k--) {
                            if (str.charAt(k) != str.charAt(j)) {
                                result[i] = String.valueOf(str.charAt(j));
                            }
                        }

                    }
                }
            }

        }
        return result;
    }
}

class RunGiai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra:");
        String string = input.nextLine();
        System.out.println(Arrays.toString(GiaiThuatThu3.findString(string)));
    }
}