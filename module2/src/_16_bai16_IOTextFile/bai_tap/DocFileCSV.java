package _16_bai16_IOTextFile.bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter path of file:");
        String readFilePath = input.nextLine();
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

class Country{
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Country {"+
                "id = " + id +
                 ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}