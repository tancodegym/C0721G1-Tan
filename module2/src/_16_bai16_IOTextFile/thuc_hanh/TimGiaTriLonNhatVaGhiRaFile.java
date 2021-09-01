package _16_bai16_IOTextFile.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimGiaTriLonNhatVaGhiRaFile {
    static class ReadAndWriteFile{
        public List<Integer> readFile(String filePath){
            List<Integer> numbers= new ArrayList<>();
            try{
                File file = new File(filePath);
                if(!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
                String line ="";
                while((line=bufferedReader.readLine())!=null){
                    numbers.add(Integer.parseInt(line));
                }
                bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return numbers;
        }
        public void writeFile(String filePath, int max){
            try{
                FileWriter writer = new FileWriter(filePath,true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("Max is :" +max);
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    static class FindMaxValue{
        public static int findMaxValue(List<Integer> numbers){
            int max = numbers.get(0);
            for (Integer number : numbers) {
                if (max < number) {
                    max = number;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter path of read file:");
            String readFilePath = input.nextLine();
            System.out.println("Enter path of write file:");
            String writeFilePath = input.nextLine();
            ReadAndWriteFile readAndWriteFile= new ReadAndWriteFile();
            List<Integer> numbers= readAndWriteFile.readFile(readFilePath);
            int maxValue = findMaxValue(numbers);
            readAndWriteFile.writeFile(writeFilePath, maxValue);
            System.out.println("Check your write file !!");
        }
    }
}
