package _exam_module2.util;

import _bai_tap_them.bai_2.model.CountryCustomer;
import _bai_tap_them.bai_2.model.Customer;
import _bai_tap_them.bai_2.model.OtherCustomer;
import _case_study.model.Employee;
import _exam_module2.model.ClassStudent;
import _exam_module2.model.Student;
import _exam_module2.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static List<String> readFromCSV(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Student> getListStudent(String path) {

        List<String> listString = readFromCSV(path);
        List<Student> studentList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            Student student = new Student(array[0], array[1], array[2], array[3],
                    array[4], array[5]);
            studentList.add(student);
        }
        return studentList;
    }

    public static List<Teacher> getListTeacher(String path) {

        List<String> listString = readFromCSV(path);
        List<Teacher> teacherList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            Teacher teacher = new Teacher(array[0], array[1], array[2], array[3],
                    array[4]);
            teacherList.add(teacher);
        }
        return teacherList;
    }

    public static List<ClassStudent> getListClass(String path) {

        List<String> listString = readFromCSV(path);
        List<ClassStudent> classStudentList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            ClassStudent classStudent = new ClassStudent(array[0], array[1], array[2]);
            classStudentList.add(classStudent);
        }
        return classStudentList;
    }

}
