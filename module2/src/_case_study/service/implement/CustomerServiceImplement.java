package _case_study.service.implement;

import _case_study.model.*;
import _case_study.service.CustomerService;
import _case_study.utils.ReadFile;
import _case_study.utils.Validate;
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
            try {
                System.out.println("Enter new employee code");
                customerCode = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            flag = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerCode().equals(customerCode)) {
                    System.out.println("Customer code is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        try {
            String customerType = chooseTypeCustomer();
            System.out.println("Enter name of customer");
            String name = input.nextLine();
            String dateOfBirth;
            do {
                System.out.println("Enter date of birth  of customer:");
                dateOfBirth = input.nextLine();
            }
            while (!Validate.validateDateOfBirth(dateOfBirth));
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
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        String codeOfCustomer = "";
        boolean flag = true;
        boolean check = true;
        while (flag) {
            try {
                System.out.println("Enter code of customer you want to edit:");
                codeOfCustomer = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
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
                            String name = "";
                            try {
                                System.out.println("Enter new name of customer : ");
                                name = input.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            customer.setName(name);
                            break;
                        case "2":
                            String dateOfBirth = "";
                            try {
                                do {
                                    System.out.println("Enter new date of birth  of customer : ");
                                    dateOfBirth = input.nextLine();}
                                while(!Validate.validateDateOfBirth(dateOfBirth));
                                } catch(Exception e){
                                    e.printStackTrace();
                                }
                                customer.setDateOfBirth(dateOfBirth);
                                break;
                                case "3":
                                    String gender = "";
                                    try {
                                        System.out.println("Enter new gender of customer : ");
                                        gender = input.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    customer.setGender(gender);
                                    break;
                                case "4":
                                    String idCard = "";
                                    try {
                                        System.out.println("Enter new id card of customer : ");
                                        idCard = input.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    customer.setIdCard(idCard);
                                    break;
                                case "5":
                                    String phoneNumber = "";
                                    try {
                                        System.out.println("Enter phone number of customer : ");
                                        phoneNumber = input.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    customer.setPhoneNumber(phoneNumber);
                                    break;
                                case "6":
                                    String email = "";
                                    try {
                                        System.out.println("Enter new email of customer : ");
                                        email = input.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    customer.setEmail(email);
                                    break;
                                case "7":
                                    String address = "";
                                    try {
                                        System.out.println("Enter new address of customer : ");
                                        address = input.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    customer.setAddress(address);
                                    break;
                                case "8":
                                    String code = "";
                                    try {
                                        System.out.println("Enter new code of customer : ");
                                        code = input.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    customer.setCustomerCode(code);
                                    break;
                                case "9":
                                    String customerType = chooseTypeCustomer();
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

        private String chooseTypeCustomer () {
            System.out.println("Choose type of customer: ");
            String customerType;
            String choose = input.nextLine();
            System.out.println("Choose type of customer: "
                    + "1.Diamond \n"
                    + "2.Platinium \n"
                    + "3.Gold \n"
                    + "4.Silver \n"
                    + "5.Member ");
            switch (choose) {
                case "1":
                    customerType = "Diamond";
                    break;
                case "2":
                    customerType = "Platinium";
                    break;
                case "3":
                    customerType = "Gold";
                    break;
                case "4":
                    customerType = "Silver";
                    break;
                case "5":
                    customerType = "Member";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
            return customerType;
        }


    }
