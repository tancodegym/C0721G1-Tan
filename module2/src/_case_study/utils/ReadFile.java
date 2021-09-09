package _case_study.utils;


import _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
 public class ReadFile {
     public static <E> List<E> readDataFromFile(String path) {
         List<E> list = new ArrayList<>();
         File file = new File(path);
         if (file.length() > 0) {
             try {
                 FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis);
                 list = (List<E>) ois.readObject();
                 fis.close();
                 ois.close();
                 System.out.println("Read completed !");

             } catch (FileNotFoundException fileNotFoundException) {

             } catch (IOException ioException) {
                 ioException.printStackTrace();
             } catch (ClassNotFoundException classNotFoundException) {
                 classNotFoundException.printStackTrace();
             }
             return list;

         } else {
             return list;
         }
}}
