package _case_study.service.implement;

import _case_study.model.*;
import _case_study.service.CustomerService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImplement implements CustomerService {
    Scanner input = new Scanner(System.in);
    @Override
    public void add(String path) {
        List<Customer> customerList = ReadFile.getListCustomer(path);
        String customerCode = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new employee code");
            customerCode = input.nextLine();
            flag = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerCode().equals(customerCode)) {
                    System.out.println("Customer code is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter type of customer: ");
        String customerType =  input.nextLine();
        System.out.println("Enter name of customer");
        String name = input.nextLine();
        System.out.println("Enter date of birth  of customer:");
        String dateOfBirth = input.nextLine();
        System.out.println("Enter gender of customer:");
        String gender = input.nextLine();
        System.out.println("Enter id card of customer:");
        String idCard = input.nextLine();
        System.out.println("Enter phone number of customer:");
        String phoneNumber = input.nextLine();
        System.out.println("Enter email of customer:");
        String email = input.nextLine();
        System.out.println("Enter address of customer");
        String address = input.nextLine();
        customerList.add(new Customer(name, dateOfBirth, gender, idCard, phoneNumber, email, address, customerCode, customerType));
        System.out.println("Add customer completed !");
        WriteFile.writeCustomerToCSV(path, customerList, false);
        display(path);

    }
    @Override
    public void display(String path) {
        List<Customer> customerList = ReadFile.getListCustomer(path);
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
    @Override
    public void edit(String path) {
        List<Customer> customerList = ReadFile.getListCustomer(path);
        display(path);
        String codeOfCustomer;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter code of customer you want to edit:");
            codeOfCustomer = input.nextLine();
            flag = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerCode().equals(codeOfCustomer)) {
                    System.out.println("---Menu Edit---\n"
                            + "1. Edit name of customer \n"
                            + "2. Edit date of birth customer \n"
                            + "3. Edit gender of customer \n"
                            + "4. Edit id card of customer \n"
                            + "5. Edit phone number of customer \n"
                            + "6. Edit email of customer \n"
                            + "7. Edit address of customer \n"
                            + "8. Edit code of customer \n"
                            + "9. Edit type of customer \n"
                            + "0. Exit menu edit\n"
                            + "Enter your choose: ");
                    String choose = input.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("Enter new name of customer : ");
                            String name = input.nextLine();
                            customer.setName(name);
                            break;
                        case "2":
                            System.out.println("Enter new date of birth  of customer : ");
                            String dateOfBirth = input.nextLine();
                            customer.setDateOfBirth(dateOfBirth);
                            break;
                        case "3":
                            System.out.println("Enter new gender of customer : ");
                            String gender = input.nextLine();
                            customer.setGender(gender);
                            break;
                        case "4":
                            System.out.println("Enter new id card of customer : ");
                            String idCard = input.nextLine();
                            customer.setIdCard(idCard);
                            break;
                        case "5":
                            System.out.println("Enter phone number of customer : ");
                            String phoneNumber = input.nextLine();
                            customer.setPhoneNumber(phoneNumber);
                            break;
                        case "6":
                            System.out.println("Enter new email of customer : ");
                            String email = input.nextLine();
                            customer.setEmail(email);
                            break;
                        case "7":
                            System.out.println("Enter new address of customer : ");
                            String address = input.nextLine();
                            customer.setAddress(address);
                            break;
                        case "8":
                            System.out.println("Enter new code of customer : ");
                            String code = input.nextLine();
                            customer.setCustomerCode(code);
                            break;
                        case "9":
                            System.out.println("Enter new type of customer : ");
                            String customerType =  input.nextLine();
                            customer.setCustomerType(customerType);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + choose);
                    }
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Customer name does not exist, please re-enter another name !");
                flag = true;
            }
        }
        WriteFile.writeCustomerToCSV(path, customerList, false);
        display(path);
    }


}
