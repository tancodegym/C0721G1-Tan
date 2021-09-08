package _16_bai16_IOTextFile.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Main{
    public static void main(String[] args) {
        String readFilePath = "src\\_16_bai16_IOTextFile\\bai_tap\\doc_file_csv\\country.csv";
        BufferedReader bufferedReader =null;
        try{
            String line;
            bufferedReader= new BufferedReader(new FileReader(readFilePath ));
            while((line=bufferedReader.readLine())!=null){
                printCountry(parseCsvLine(line));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
