package _13_bai13_ThuatToanTimKiem.thuc_hanh;

import java.util.Scanner;

public class TinhDoPhucTapCuaThuatToan {
    public static class AlgorithmComplexityTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();
            int[] frequentChar = new int[255];                           //1
            for (int i = 0; i < inputString.length(); i++) {             //2
                int ascii = (int) inputString.charAt(i);                 //3
                frequentChar[ascii] += 1;                                //4
            }
            int max = 0;                                                //{5}
            char character = (char) 255; /* empty character */           //{6}
            for (int j = 0; j < 255; j++) {                               //{7}
                if (frequentChar[j] > max) {                              //{8}
                    max = frequentChar[j];                                 //{9}
                    character = (char) j;                                   //{10}
                }
            }
            System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
        }
    }
}
/**********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:                                           *
 * 	- Thời  gian thực hiện lệnh {1}là O(1)                                        *
 *  -	 Vòng lặp {2} thực hiện (n) lần,                                          *
 * 	  mỗi lần O(1) do đó vòng lặp {2} tốn O((n).1) = O(n)(Với n là độ dài chuỗi)  *
 *  -Hai lệnh gán {3},{4},{9},{10} đều tốn O(1) thời gian.                        *
 *  - Lệnh {5} và {6} tốn O(1) thời gian.                                         *
 *  - so sánh frequentChar[j] > max  cũng tốn O(1) thời gian,                     *
 *  do đó lệnh {8} tốn O(1) thời gian.                                            *
 *  - Vòng lặp {7} thực hiện (255) lần,                                           *
 *  mỗi lần O(1) do đó vòng lặp {7} tốn O((255).1) = O(255).                      *
 *  Độ phức tạp của bài toán bằng thời gian thi hành lệnh lâu nhất .              *
 *  + Trường hợp 1:                                                               *
 *  n<=255 : Độ phức tạp bài toán này là O(255).                                  *
 *  +Trường hợp 2:                                                                *
 *  n>=255: Độ phức tạp bài toán này là O(n)                                      *
 *                                                                                *
 * 	=> Độ phức tạp bài toán này là O(n^2)                                         *
 *********************************************************************************/