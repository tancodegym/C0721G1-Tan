package _exam_module2.controller;

import _exam_module2.service.StudentService;
import _exam_module2.service.TeacherService;
import _exam_module2.service.implement.StudentServiceImplement;
import _exam_module2.service.implement.TeacherServiceImplement;

import java.util.Scanner;

public class Controller {
    static Scanner input = new Scanner(System.in);
    static StudentService studentService = new StudentServiceImplement();
    static TeacherService teacherService = new TeacherServiceImplement();

    public static void displayMainMenu() {
        while (true) {
            System.out.println("Menu Student Manager \n" +
                    "1.Add Student\n" +
                    "2.Delete Student\n" +
                    "3.Watch Student List\n" +
                    "4.Watch Teacher List \n" +
                    "5.Find Student\n" +
                    "6.Exit Menu"
            );
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    studentService.addStudent();
                    break;
                case "2":
                    studentService.deleteStudent();
                    break;
                case "3":
                    studentService.display();
                    break;
                case "4":
                    teacherService.display();
                    break;
                case "5":
                    studentService.findStudent();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("Enter again !");
                    displayMainMenu();
                    break;
            }
        }

    }

}

