package _17_bai17_IOBinaryFileAndSerialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class RunMain {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
            System.out.println("Write compeleted !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter path : ");
        String path = input.nextLine();
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nguyen Van A", "Hà Nội"));
        studentList.add(new Student(2, "Nguyen Van c", "Đà Nẵng"));
        studentList.add(new Student(3, "Nguyen Thi E", "Hà Nội"));
        studentList.add(new Student(4, "Nguyen Thi A", "Hồ Chí Minh"));
        studentList.add(new Student(5, "Nguyen Van F", "Hà Nội"));
        writeToFile(path, studentList);
        System.out.println();
        List<Student> studentDataFromFile = readDataFromFile(path);
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }


    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Read completed !");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }

}


