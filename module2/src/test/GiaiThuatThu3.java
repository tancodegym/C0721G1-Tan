package test;

import java.util.Scanner;

class RunGiaiThuatThu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra:");
        String string = input.nextLine();
        findString(string);
    }

    private static void findString(String string) {
        String tempResult = "";
        for (int i = 0; i < string.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && string.charAt(i) != ' ') {
                boolean flag = false;
                for (int k = 0; k < tempResult.length(); k++) {
                    if (string.charAt(i) == tempResult.charAt(k)) {
                        flag = true;
                    }
                }
                if (!flag) {
                    tempResult += string.charAt(i);
                }
            }
        }
        System.out.println(tempResult);
    }}
//    public static String[] find1(String str) {
//        String[] arrResult = null;
//        String tempResult = "";
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//            // kiểm tra nếu xuất hiện lớn hơn 1 lần và khác " "
//            if (count > 1 && !String.valueOf(str.charAt(i)).equals(" ")) {
//                boolean flag = false;
//                // kiểm tra để lấy giá trị duy nhất
//                for (int k = 0; k < tempResult.length(); k++) {
//                    if (str.charAt(i) == tempResult.charAt(k)) {
//                        flag = true;
//                    }
//                }
//                // cho ký tự vào biến tạm nếu chưa tồn tại trong biến tạm
//                if (!flag) {
//                    tempResult += str.charAt(i);
//                }
//            }
//        }
//        // chuyển về mảng theo yêu cầu
//        arrResult = tempResult.split("");
//        return arrResult;
//    }