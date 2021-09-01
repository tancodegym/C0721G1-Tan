package _16_bai16_IOTextFile.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class TinhTongCacSoTrongFileTest {
    static class ReadFileExample {
        public void readFileTest(String filePath) {
            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }

                br.close();
                System.out.println("Total = " + sum);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Path");
        Scanner input =new Scanner(System.in);
        String path=input.nextLine();
        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileTest(path);
    }
}
//C:\Users\Administrator\Desktop\sumText.txt
//Enter Path
//C:\Users\Administrator\Desktop\sumText.txt
//        4
//        5
//        456
//        456
//        456
//        46
//        Total = 1423
