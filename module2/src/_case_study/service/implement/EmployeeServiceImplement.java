package _case_study.service.implement;
import _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.SanPham;
import _case_study.model.Employee;
import _case_study.service.EmployeeService;
import _case_study.utils.ReadFile;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImplement implements EmployeeService {
    Scanner input = new Scanner(System.in);

    @Override
    public void addList(String path) {
        List<Employee> employeeList= returnList(path);
         String employeeCode;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new employee code");
            employeeCode = input.nextLine();
            flag = false;
            for(Employee employee:employeeList){
                if(employee.getEmployeeCode()==employeeCode){
                    System.out.println("Employee code is extint, please enter again !");
                    flag = true;
                    break;
            }



            }
        }

    }
    @Override
    public  void displayList(String path) {
        List<Employee> employeeList= returnList(path);
        for(Employee employee:employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void editList(String path) {

    }

    @Override
    public List<Employee> returnList(String path) {
        List<Employee> employeeList= ReadFile.readDataFromFile(path);
        return   employeeList;
    }

    @Override
    public void deleteList(String path) {

    }


}
