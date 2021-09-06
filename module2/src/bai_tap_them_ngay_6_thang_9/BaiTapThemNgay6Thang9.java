package bai_tap_them_ngay_6_thang_9;

import java.util.*;

class RunMain {
    public static void main(String[] args) {
        boolean check = true;
        Scanner input = new Scanner(System.in);
        while (check) {
            System.out.println("Menu Student Manager\n" +
                    "1.Thêm học sinh\n" +
                    "2.Hiển thị học sinh\n" +
                    "3.Thoát");
            System.out.println("Enter your choose:");
            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.show(StudentManager.studentMap);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    check=false;
                    break;
            }
        }
    }
}

class StudentManager {
    public static Map<Student, Integer> studentMap = new TreeMap<>();


    static {
        studentMap.put(new Student("An"), 1);
        studentMap.put(new Student("Bình"), 1);
        studentMap.put(new Student("Công"), 1);
        studentMap.put(new Student("Vy"), 1);
        studentMap.put(new Student("Phúc"), 1);
    }

    public static void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên học sinh:");
        String name = input.nextLine();
        boolean flag = true;
        int count = 1;
        for (Map.Entry<Student, Integer> entry : studentMap.entrySet()) {
            if (entry.getKey().getNameStudent().equals(name)) {
                entry.setValue(entry.getValue() + 1);
                flag = false;
            }
        }
        if (flag) {
            studentMap.put(new Student(name), count);
        }
        show(studentMap);
    }
    public static void show(Map<Student, Integer> map) {
        for (Map.Entry<Student, Integer> entry : studentMap.entrySet()) {
            System.out.println("Học sinh có tên " + entry.getKey() + ", có số buổi vắng là " + entry.getValue());
        }
    }
}
class Student implements Comparable<Student> {
    private String nameStudent;

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    @Override
    public String toString() {
        return nameStudent;
    }


    public int compareTo(Student o) {
        return this.getNameStudent().compareTo(o.getNameStudent());
    }


}

