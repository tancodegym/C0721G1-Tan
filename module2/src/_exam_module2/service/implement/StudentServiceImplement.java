package _exam_module2.service.implement;
import _exam_module2.controller.Controller;
import _exam_module2.model.ClassStudent;
import _exam_module2.model.Student;
import _exam_module2.service.StudentService;
import _exam_module2.util.ReadFile;
import _exam_module2.util.Validate;
import _exam_module2.util.WriteFile;
import _exam_module2.util.exception.NotFoundStudentException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImplement implements StudentService {
    final String STUDENT_PATH = "src\\_exam_module2\\data\\student.csv";
    final String CLASS_PATH = "src\\_exam_module2\\data\\batchs.csv";
    Scanner input = new Scanner(System.in);

    @Override
    public void addStudent() {
        try {
            List<Student> studentList = ReadFile.getListStudent(STUDENT_PATH);
            String studentCode = getStudentCode();
            String nameStudent;

            do {
                System.out.println("Enter name of Student");
                nameStudent = input.nextLine();
            }
            while (!Validate.validateName(nameStudent));
            String dateOfBirth;
            do {
                System.out.println("Enter date of birth of student");
                dateOfBirth = input.nextLine();
            } while (!Validate.validateDate(dateOfBirth));
            String gender;
            do {
                System.out.println("Enter gender of student");
                gender = input.nextLine();
            } while (!Validate.validateGender(gender));
            boolean flag1 = true;
            String numberPhone = "";
            while (flag1) {
                do {
                    System.out.println("Enter number phone of student");
                    numberPhone = input.nextLine();
                }
                while (!Validate.validateNumberPhone(numberPhone));
                flag1 = false;
                for (Student student : studentList) {
                    if (student.getPersonPhone().equals(numberPhone)) {
                        flag1 = true;
                        System.out.println("Number phone of student is exist, enter another number phone !");
                        break;
                    }
                }
            }
            List<ClassStudent> classStudentList = ReadFile.getListClass(CLASS_PATH);
            boolean flag = true;
            String classCode = "";
            boolean check = true;
            while (flag) {
                do {
                    System.out.println("Enter class code");
                    classCode = input.nextLine();
                } while (!Validate.validateClassCode(classCode));
                for (ClassStudent classStudent : classStudentList) {
                    if (classStudent.getClassCode().equals(classCode)) {
                        check = false;
                        flag =false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("Enter again, class code is not exist !");
                }
            }

            Student student = new Student(studentCode, nameStudent, dateOfBirth, gender, numberPhone, classCode);
            studentList.add(student);
            WriteFile.writeStudentToCSV(STUDENT_PATH, studentList, false);
            System.out.println("Add Student Completed !!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void deleteStudent() {
        List<Student> studentList = ReadFile.getListStudent(STUDENT_PATH);
        String studentCode = "";
        try {
            System.out.println("Enter student code");
            studentCode = input.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean check = true;
        for (Student student : studentList) {
            if (student.getPersonCode().equals(studentCode)) {
                check = false;
                System.out.println("Do you want to delete student ?\n" +
                        "1. Yes    2. No");
                String choose = input.nextLine();
                try {
                    switch (choose) {
                        case "1":
                            studentList.remove(student);
                            System.out.println("Delete Student completed !");
                            WriteFile.writeStudentToCSV(STUDENT_PATH, studentList, false);
                            Controller.displayMainMenu();
                            break;
                        case "2":
                            Controller.displayMainMenu();
                            break;
                        default:
                            System.out.println("Your choose wrong, try again!");
                            deleteStudent();
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        try {
            if (check) {
                throw new NotFoundStudentException("Student is not exist ! Please enter again !");
            }
        } catch (NotFoundStudentException e) {
            System.err.println(e.getString());
        }
    }

    @Override
    public void findStudent() {
        try {
            List<Student> studentList = ReadFile.getListStudent(STUDENT_PATH);
            List<Student> listStudent = new ArrayList<>();
            String name;
            do{
            System.out.println("Enter name of Student");
             name = input.nextLine();}while(!Validate.validateName(name));
            for (Student student : studentList) {
                if (student.getPersonName().contains(name)) {
                    listStudent.add(student);
                }
            }
            if (listStudent.size() == 0) {
                System.out.println(" Found 0 student with name :" + name);
            } else {
                System.out.println("Found " + (listStudent.size() - 1) + " student");
                for (Student student : listStudent) {
                    System.out.println(student.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        try {
            List<Student> studentList = ReadFile.getListStudent(STUDENT_PATH);
            List<ClassStudent> classStudentList = ReadFile.getListClass(CLASS_PATH);
            System.out.println("List student :");
            for (Student student : studentList) {
                String studentClassName = "";
                String studentClassCode = student.getClassCode();
                for (ClassStudent classStudent : classStudentList) {
                    if (classStudent.getClassCode().equals(studentClassCode)) {
                        studentClassName = classStudent.getClassName();
                    }
                }
                System.out.println("Student has class name :" + studentClassName + " is a: ");
                student.show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String getStudentCode() {
        List<Student> studentList = ReadFile.getListStudent(STUDENT_PATH);
        int codeOfStudent = Integer.parseInt(studentList.get(studentList.size() - 1).getPersonCode()) + 1;
        return "" + codeOfStudent + "";
    }
}
