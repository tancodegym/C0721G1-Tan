package _case_study.service.implement;

import _case_study.model.Employee;
import _case_study.service.EmployeeService;
import _case_study.utils.ReadFile;
import _case_study.utils.Validate;
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
            try {
                System.out.println("Enter new employee code");
                employeeCode = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            flag = false;
            for (Employee employee : employeeList) {
                if (employee.getEmployeeCode().equals(employeeCode)) {
                    System.err.println("Employee code is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        try {
            String level = chooseLevel();
            String position = choosePosition();
            int salary;
            do {
                System.out.println("Enter salary of employee:");
                salary = Integer.parseInt(input.nextLine());
            } while (!Validate.validateSalary(salary));
            String name;
            do {
                System.out.println("Enter name of employee");
                name = input.nextLine();
            }
            while (!Validate.validateNameService(name));
            String dateOfBirth;
            do {
                System.out.println("Enter date of birth  of employee:");
                dateOfBirth = input.nextLine();
            }
            while (!Validate.validateDateOfBirth(dateOfBirth));
            String gender;
            do {
                System.out.println("Enter gender of employee:");
                gender = input.nextLine();
            }
            while (!Validate.validateGender(gender));
            String idCard;
            do {
                System.out.println("Enter id card of employee:");
                idCard = input.nextLine();
            }
            while (!Validate.validateIdCard(idCard));
            String phoneNumber;
            do {
                System.out.println("Enter phone number of employee:");
                phoneNumber = input.nextLine();
            }
            while (!Validate.validateNumberPhone(phoneNumber));
            String email;
            do {
                System.out.println("Enter email of employee:");
                email = input.nextLine();
            }
            while (!Validate.validateEmail(email));

            System.out.println("Enter address of employee");
            String address = input.nextLine();

            employeeList.add(new Employee(name, dateOfBirth, gender, idCard, phoneNumber, email, address, employeeCode, level, position, salary));
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        String codeOfEmployee = "";
        boolean flag = true;
        boolean check = true;
        while (flag) {
            try {
                System.out.println("Enter code of employee you want to edit:");
                codeOfEmployee = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
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
                            String name = "";
                            try {
                                System.out.println("Enter new name of employeee : ");
                                name = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setName(name);
                            break;
                        case "2":
                            String dateOfBirth = "";
                            try {
                                do {
                                    System.out.println("Enter new date of birth  of employeee : ");
                                    dateOfBirth = input.nextLine();
                                }
                                while (!Validate.validateDateOfBirth(dateOfBirth));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setDateOfBirth(dateOfBirth);
                            break;
                        case "3":
                            String gender = "";
                            try {
                                System.out.println("Enter new gender of employeee : ");
                                gender = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setGender(gender);
                            break;
                        case "4":
                            String idCard = "";
                            try {
                                System.out.println("Enter new id card of employeee : ");
                                idCard = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setIdCard(idCard);
                            break;
                        case "5":
                            String phoneNumber = "";
                            try {
                                System.out.println("Enter phone number of employeee : ");
                                phoneNumber = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setPhoneNumber(phoneNumber);
                            break;
                        case "6":
                            String email = "";
                            try {
                                System.out.println("Enter new email of employeee : ");
                                email = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setEmail(email);
                            break;
                        case "7":
                            String address = "";
                            try {
                                System.out.println("Enter new address of employeee : ");
                                address = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setAddress(address);
                            break;
                        case "8":
                            String code = "";
                            try {
                                System.out.println("Enter new code of employeee : ");
                                code = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            employee.setEmployeeCode(code);
                            break;
                        case "9":
                            String level = chooseLevel();
                            employee.setLevel(level);
                            break;
                        case "10":
                            String position = choosePosition();
                            employee.setPosition(position);
                            break;
                        case "11":
                            int salary = 0;
                            try {
                                System.out.println("Enter new salary of employeee : ");
                                salary = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
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

    private String chooseLevel() {
        String level;
        System.out.println("Choose level: "
                + "1.Intermediate \n"
                + "2.College \n"
                + "3.University \n"
                + "4.Postgraduate");
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                level = "Intermediate";
                break;
            case "2":
                level = "College";
                break;
            case "3":
                level = "University";
                break;
            case "4":
                level = "Postgraduate";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        return level;
    }

    private String choosePosition() {

        String position;

        System.out.println("Choose position: "
                + "1.Receptionist \n" //Lễ tân
                + "2.Staff \n" //phục vụ
                + "3.Expert \n" //chuyên viên
                + "4.Monitor \n" //Giám sát
                + "5.Manager \n"  //Quản lý
                + "6.Direction"); //giám đốc
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                position = "Receptionist";
                break;
            case "2":
                position = "Staff";
                break;
            case "3":
                position = "Expert";
                break;
            case "4":
                position = "Monitor";
                break;
            case "5":
                position = "Manager";
                break;
            case "6":
                position = "Direction";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        return position;
    }
}








