package _11_bai11_DSAStackAndQueue.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String stringInput = input.nextLine();
        String newString = stringInput.trim().replaceAll(" +", " ");
        String[] stringArray = newString.split(" ");
        Map<String, Integer> stringMap = new TreeMap<>();
        for (String string : stringArray) {
            string = string.toLowerCase();
            int count = 1;
//            if (string.equals(" ")) {
//                continue;
//            }
            if (stringMap.containsKey(string)) {
                count++;
                stringMap.put(string, count);
            } else {
                stringMap.put(string, count);
            }
        }
        System.out.println("Number of occurrences of each word in a string is: ");
        System.out.println(stringMap);

    }


}

