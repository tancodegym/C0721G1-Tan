package _16_bai16_IOTextFile.bai_tap;

//import java.io.*;
//import java.util.Scanner;
//
//public class CopyFileText {
//    public static void main(String[] args) throws IOException {
//        InputStream inStream = null;
//        OutputStream outStream = null;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter path of file:");
//        String readFilePath = input.nextLine();
//        System.out.println("Enter path of file you want to copy to :");
//        String writeFilePath = input.nextLine();
//        try {
//            inStream = new FileInputStream(new File(readFilePath));
//            outStream = new FileOutputStream(new File(writeFilePath));
//
//            File file = new File(readFilePath);
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            int length;
//            byte[] buffer = new byte[1024];
//            while ((length = inStream.read(buffer)) > 0) {
//                outStream.write(buffer, 0, length);
//            }
//            System.out.println("File is copied successful!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            inStream.close();
//            outStream.close();
//        }
//    }
//}
//
////Cách 2: Copy file sử dụng File class:
////private static void copyFile(File source, File dest) throws IOException {
////    Files.copy(source.toPath(), dest.toPath());
////}
//
//Cách 3: Copy bằng đọc ghi file:
import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    static class ReadAndWriteFile{
        public String readFile(String filePath){
            String readString="";
            try{
                File file = new File(filePath);
                if(!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
                String line ="";
                while((line=bufferedReader.readLine())!=null){
                   readString+=line+"\n";
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return readString;
        }
        public void writeFile(String filePath, String writeString){
            try{
                FileWriter writer = new FileWriter(filePath,false);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(writeString);
                bufferedWriter.close();
                System.out.println("File write completed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter path of file:");
        String readFilePath = input.nextLine();
        System.out.println("Enter path of file you want to copy to :");
        String writeFilePath = input.nextLine();
        ReadAndWriteFile readAndWriteFile =new ReadAndWriteFile();
        readAndWriteFile.writeFile(writeFilePath,readAndWriteFile.readFile(readFilePath));
    }
}