package _05_bai5_AccessModifier.bai_tap;

import java.util.Scanner;


class Student {
    private String name;
    private String classes;

    Student() {
        this.name = "John";
        this.classes = "C02";
    }

    void setName(String name) {
        this.name = name;

    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    void getName() {
        System.out.println(name);
    }
// private không gợi được 
    void getClasses() {
        System.out.println(classes);
    }

}

class Test {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student();
        studentA.getClasses();
        studentA.getName();
        studentB.getClasses();
        studentB.getName();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of student A: ");
        String nameOfStudentA = input.nextLine();
        System.out.println("Enter name of student B: ");
        String nameOfStudentB = input.nextLine();
        System.out.println("Enter classes of student A: ");
        String classesOfStudentA = input.nextLine();
        System.out.println("Enter classes of student B: ");
        String classesOfStudentB = input.nextLine();
        studentA.setName(nameOfStudentA);
        studentB.setName(nameOfStudentB);
        studentA.setClasses(classesOfStudentA);
        studentB.setClasses(classesOfStudentB);
        studentA.getClasses();
        studentA.getName();
        studentB.getClasses();
        studentB.getName();

    }
}

