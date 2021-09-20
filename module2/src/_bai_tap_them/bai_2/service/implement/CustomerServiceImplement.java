package _bai_tap_them.bai_2.service.implement;

import _bai_tap_them.bai_2.controller.ElectricBillManagerment;
import _bai_tap_them.bai_2.model.CountryCustomer;
import _bai_tap_them.bai_2.model.Customer;
import _bai_tap_them.bai_2.model.OtherCustomer;
import _bai_tap_them.bai_2.model.TypeOfCustomer;
import _bai_tap_them.bai_2.service.CustomerService;
import _bai_tap_them.bai_2.util.ReadElectricFile;
import _bai_tap_them.bai_2.util.WriteElectricFile;

import java.util.*;

public class CustomerServiceImplement  implements CustomerService {
    static Scanner input = new Scanner(System.in);
    final String CUSTOMER_FILE_PATH = "src\\_bai_tap_them\\bai_2\\data\\customer.csv";
    final String TYPE_CUSTOMER_FILE_PATH = "src\\_bai_tap_them\\bai_2\\data\\type_customer.csv";
    @Override
    public void add() {
        System.out.println("Menu add customer \n"+
                "1.Add country customer \n"+
                "2. Add Other country customer\n"+
                "3. Return main menu \n"+
                "4. Exit menu \n"+
                "Enter your choose : ");
        String choose = input.nextLine();
        switch (choose){
            case "1":
                addCountryCustomer();
                break;
            case "2":
                addOtherCustomer();
                break;
            case "3":
                ElectricBillManagerment.displayMainMenu();
                break;
            case "4":
                System.exit(0);
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }

    }
    private void addCountryCustomer(){
        List<Customer> customerList = ReadElectricFile.getListCustomer(CUSTOMER_FILE_PATH);
        boolean check =true;
        String customerCode="";
        while(check){
            System.out.println("Enter customer code:");
             customerCode = input.nextLine();
            check =false;
            for(Customer customer : customerList){
                if(customer.getCustomerCode().equals(customerCode)){
                    System.out.println("Please enter again, customer code is exist !");
                    check =true;
                    break;
                }
            }
        }
        System.out.println("Enter name of customer: ");
        String nameCustomer = input.nextLine();
        List<TypeOfCustomer> typeOfCustomerList = ReadElectricFile.getListTypeOfCustomer(TYPE_CUSTOMER_FILE_PATH);
        System.out.println("List type of customer : ");
        boolean flag = true;
        String typeCustomer="";
        boolean testType=true;
        while(flag){
            for (TypeOfCustomer typeOfCustomer : typeOfCustomerList) {
                System.out.println(typeOfCustomer.getString());
            }
            System.out.println("Enter type of customer: ");
            typeCustomer = input.nextLine();

            for(TypeOfCustomer typeOfCustomer1: typeOfCustomerList){
                if(typeOfCustomer1.getCodeOfTypeCustomer().equals(typeCustomer)){
                    flag = false;
                    testType= false;
                    break;
                }
            }
            if(testType){
            System.out.println("Enter again, type of customer wrong !");}
        }
        System.out.println("Enter Limit of user");
        String limitEmployment = input.nextLine();
        CountryCustomer customer = new CountryCustomer(customerCode,nameCustomer,typeCustomer,limitEmployment);
        customerList.add(customer);
        WriteElectricFile.writeCustomerListToCSV(CUSTOMER_FILE_PATH,customerList,false);
    }
    private void addOtherCustomer(){
        List<Customer> customerList = ReadElectricFile.getListCustomer(CUSTOMER_FILE_PATH);
        boolean check =true;
        String customerCode="";
        while(check){
            System.out.println("Enter customer code:");
            customerCode = input.nextLine();
            check =false;
            for(Customer customer : customerList){
                if(customer.getCustomerCode().equals(customerCode)){
                    System.out.println("Please enter again, customer code is exist !");
                   check=true;
                    break;
                }
            }

        }
        System.out.println("Enter name of customer: ");
        String nameCustomer = input.nextLine();
        System.out.println("Enter country of customer :");
        String country = input.nextLine();
        OtherCustomer customer = new OtherCustomer(customerCode,nameCustomer,country);
        customerList.add(customer);
        WriteElectricFile.writeCustomerListToCSV(CUSTOMER_FILE_PATH,customerList,false);
    }


    @Override
    public void display() {
       List<Customer> customerList = ReadElectricFile.getListCustomer(CUSTOMER_FILE_PATH);
        for(Customer customer : customerList){
            System.out.println(customer.toString());
//            if(customer instanceof  CountryCustomer){
//                System.out.println((customer).toString());
//            }
//            if(customer instanceof  OtherCustomer){
//                System.out.println(( customer).toString());
//            }
        }
    }

    @Override
    public void find() {
        List<Customer> customers= ReadElectricFile.getListCustomer(CUSTOMER_FILE_PATH);

        List<Customer> customerList = new ArrayList<>();

        System.out.println("Enter name of customer: ");
         String nameCustomer = input.nextLine();
        for( Customer customer: customers){
            if(customer.getName().contains(nameCustomer)){
               customerList.add(customer);
            }
        }
        System.out.println("Found "+customerList.size()+" customer with name : " + nameCustomer);
        int i =1;
        for(Customer customer : customerList){
            System.out.println(i+" : "+customer.toString());
            i++;
        }
    }
}
