package _exam_module2.service.implement;

import _exam_module2.model.Teacher;
import _exam_module2.service.TeacherService;
import _exam_module2.util.ReadFile;

import java.util.List;
import java.util.Scanner;

public class TeacherServiceImplement implements TeacherService {
    final String TEACHER_PATH = "src\\_exam_module2\\data\\teacher.csv";

    @Override
    public void display() {
        List<Teacher> teacherList = ReadFile.getListTeacher(TEACHER_PATH);
        System.out.println("Enter teacher code");
        Scanner input = new Scanner(System.in);
        String teacherCode = input.nextLine();
        boolean flag = true;
        for (Teacher teacher : teacherList) {
            if(teacher.getPersonCode().equals(teacherCode))
            System.out.println(teacher);
            flag =false;
        }
        if(flag){
            System.out.println("Teacher not exist !");
        }
    }
}
