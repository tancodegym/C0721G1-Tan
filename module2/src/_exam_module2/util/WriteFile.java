package _exam_module2.util;

import _bai_tap_them.bai_2.model.CountryCustomer;
import _bai_tap_them.bai_2.model.Customer;
import _bai_tap_them.bai_2.model.OtherCustomer;
import _case_study.model.Employee;
import _exam_module2.model.Student;
import _exam_module2.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static void writeToFile(String path, List<String> list, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeStudentToCSV(String path, List<Student> studentList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Student student : studentList) {
            stringList.add(student.getStudentString());
        }
        writeToFile(path, stringList, append);
    }

    public static void writeTeacherToCSV(String path, List<Teacher> teacherList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            stringList.add(teacher.getTeacherString());
        }
        writeToFile(path, stringList, append);
    }

}



