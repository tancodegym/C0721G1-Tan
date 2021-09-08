package _case_study.service.implement;

import _case_study.model.Employee;
import _case_study.model.Level;
import _case_study.model.Position;
import _case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImplement implements EmployeeService {
    Scanner input = new Scanner(System.in);
    static List<Employee> employeeList= new ArrayList<>();
    static{
        employeeList.add(new Employee("Nguyen Van A","15/01/1991","Male","201605626",
                                        "0947829245","tan@gmail.com","Đà Nẵng",
                "E1",new Level("Trung cấp"),new Position("Phục vụ"),5000000));
    }
    @Override
    public void addList() {

    }

    @Override
    public void displayList() {

    }

    @Override
    public void editList() {

    }

    @Override
    public void deleteList() {

    }
}
