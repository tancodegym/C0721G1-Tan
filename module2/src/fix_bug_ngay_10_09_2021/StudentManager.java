package fix_bug_ngay_10_09_2021;

import fix_bug_ngay_10_09_2021.util.ReadAndWrite;

import java.util.*;

public class StudentManager {
    static final String PATH = "src\\fix_bug_ngay_10_09_2021\\student.csv";

    // thêm mới student
    public static void add() {
        List<Student> studentList = ReadAndWrite.getListStudent(PATH);
        System.out.println(studentList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập dịa chỉ");
        String address = scanner.nextLine();
        Student student = new Student(name, age, address);
        studentList.add(student);
        ReadAndWrite.writeListStudentToCSV(PATH, studentList, false);
    }

    // hiện thị danh sách
    public static void display() {
        List<Student> studentList = ReadAndWrite.getListStudent(PATH);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i));
        }
    }
}
