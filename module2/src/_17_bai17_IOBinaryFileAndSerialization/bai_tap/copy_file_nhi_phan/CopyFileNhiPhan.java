package _17_bai17_IOBinaryFileAndSerialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileNhiPhan {

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }}

        finally{
            is.close();
            os.close();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter source life: ");
        String sourcePath = input.nextLine();
        System.out.println("Enter destination file : ");
        String destPath = input.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.println(" Copy completed !");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file !!");
            System.out.println(ioe.getMessage());
        }
    }
}
