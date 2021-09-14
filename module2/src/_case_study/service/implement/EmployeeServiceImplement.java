package _case_study.service.implement;

import _case_study.model.Employee;
import _case_study.model.Level;
import _case_study.model.Position;
import _case_study.service.EmployeeService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;
import java.util.List;
import java.util.Scanner;
public class EmployeeServiceImplement implements EmployeeService {
    Scanner input = new Scanner(System.in);
    @Override
    public void add(String path) {
        List<Employee> employeeList = ReadFile.getListEmployee(path);
        String employeeCode = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new employee code");
            employeeCode = input.nextLine();
            flag = false;
            for (Employee employee : employeeList) {
                if (employee.getEmployeeCode().equals(employeeCode)) {
                    System.out.println("Employee code is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter level of employee: ");
        Level level = new Level(input.nextLine());
        System.out.println("Enter position of employee:");
        Position position = new Position(input.nextLine());
        System.out.println("Enter salary of employee:");
        int salary = Integer.parseInt(input.nextLine());
        System.out.println("Enter name of employee");
        String name = input.nextLine();
        System.out.println("Enter date of birth  of employee:");
        String dateOfBirth = input.nextLine();
        System.out.println("Enter gender of employee:");
        String gender = input.nextLine();
        System.out.println("Enter id card of employee:");
        String idCard = input.nextLine();
        System.out.println("Enter phone number of employee:");
        String phoneNumber = input.nextLine();
        System.out.println("Enter email of employee:");
        String email = input.nextLine();
        System.out.println("Enter address of employee");
        String address = input.nextLine();
        employeeList.add(new Employee(name, dateOfBirth, gender, idCard, phoneNumber, email, address, employeeCode, level, position, salary));
        System.out.println("Add employee completed !");
        WriteFile.writeEmployeeToCSV(path, employeeList, false);
        display(path);

    }
    @Override
    public void display(String path) {
        List<Employee> employeeList = ReadFile.getListEmployee(path);
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
    @Override
    public void edit(String path) {
        List<Employee> employeeList = ReadFile.getListEmployee(path);
        display(path);
        String codeOfEmployee;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter code of employee you want to edit:");
            codeOfEmployee = input.nextLine();
            flag = false;
            for (Employee employee : employeeList) {
                if (employee.getEmployeeCode().equals(codeOfEmployee)) {
                    System.out.println("---Menu Edit---\n"
                            + "1. Edit name of Employee \n"
                            + "2. Edit date of birth Employee \n"
                            + "3. Edit gender of Employee \n"
                            + "4. Edit id card of Employee \n"
                            + "5. Edit phone number of Employee \n"
                            + "6. Edit email of Employee \n"
                            + "7. Edit address of Employee \n"
                            + "8. Edit code of Employee \n"
                            + "9. Edit level of Employee \n"
                            + "10. Edit position of Employee \n"
                            + "11. Edit salary of Employee \n"
                            + "0. Exit menu edit\n"
                            + "Enter your choose: ");
                    String choose = input.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("Enter new name of employeee : ");
                            String name = input.nextLine();
                            employee.setName(name);
                            break;
                        case "2":
                            System.out.println("Enter new date of birth  of employeee : ");
                            String dateOfBirth = input.nextLine();
                            employee.setDateOfBirth(dateOfBirth);
                            break;
                        case "3":
                            System.out.println("Enter new gender of employeee : ");
                            String gender = input.nextLine();
                            employee.setGender(gender);
                            break;
                        case "4":
                            System.out.println("Enter new id card of employeee : ");
                            String idCard = input.nextLine();
                            employee.setIdCard(idCard);
                            break;
                        case "5":
                            System.out.println("Enter phone number of employeee : ");
                            String phoneNumber = input.nextLine();
                            employee.setPhoneNumber(phoneNumber);
                            break;
                        case "6":
                            System.out.println("Enter new email of employeee : ");
                            String email = input.nextLine();
                            employee.setEmail(email);
                            break;
                        case "7":
                            System.out.println("Enter new address of employeee : ");
                            String address = input.nextLine();
                            employee.setAddress(address);
                            break;
                        case "8":
                            System.out.println("Enter new code of employeee : ");
                            String code = input.nextLine();
                            employee.setEmployeeCode(code);
                            break;
                        case "9":
                            System.out.println("Enter new level of employeee : ");
                            Level level = new Level(input.nextLine());
                            employee.setLevel(level);
                            break;
                        case "10":
                            System.out.println("Enter new position of employeee : ");
                            Position position = new Position(input.nextLine());
                            employee.setPosition(position);
                            break;
                        case "11":
                            System.out.println("Enter new salary of employeee : ");
                            int salary = Integer.parseInt(input.nextLine());
                            employee.setSalary(salary);
                            break;
                        default:
                            break;
                    }
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Employee name does not exist, please re-enter another name !");
                flag = true;
            }
        }
        WriteFile.writeEmployeeToCSV(path, employeeList, false);
        display(path);
    }
}







