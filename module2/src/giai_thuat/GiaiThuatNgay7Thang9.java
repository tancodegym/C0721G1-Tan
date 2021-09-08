package giai_thuat;

import java.util.Arrays;

public class GiaiThuatNgay7Thang9 {
    public static int count = 0;

    public static void main(String[] args) {
//\\\ abc 123 abc abc a def
//                        123 a abc abc abc abc def
        String[] array = {"abc", "123", "abc", "abc", "a", "def"};
        String[] result = findNoDuplication(array);
        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                continue;
            }
            System.out.println(result[i]);
        }
    }
    public static String[] findNoDuplication(String[] array) {
        String prev = "";
        Arrays.sort(array);
        int number = 0;
        String[] newString = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            if (!prev.equals(str)) {
                count = 0;
                countArray(array, 0, str);
                prev = str;
                newString[number] = array[i] + ":" + count;
                number++;
            }
        }
        return newString;
    }
    private static void countArray(String[] arr, int index, String str) {
        if (index == arr.length) {
            return;
        } else {
            if (arr[index].equals(str)) {
                count += 1;
            }
            countArray(arr, index + 1, str);
        }
    }
}
