package _bai_tap_them.bai_2.service.implement;

import _bai_tap_them.bai_2.model.Bill;
import _bai_tap_them.bai_2.model.CountryCustomer;
import _bai_tap_them.bai_2.model.Customer;
import _bai_tap_them.bai_2.model.OtherCustomer;
import _bai_tap_them.bai_2.service.BillService;
import _bai_tap_them.bai_2.util.ReadElectricFile;
import _bai_tap_them.bai_2.util.VldElectric;
import _bai_tap_them.bai_2.util.WriteElectricFile;

import java.util.*;

public class BillServiceImplement implements BillService {
    static final String CUSTOMER_FILE_PATH = "src\\_bai_tap_them\\bai_2\\data\\customer.csv";
    static final String BILL_PATH = "src\\_bai_tap_them\\bai_2\\data\\bill.csv";
    static Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        try {
            List<Bill> billList = ReadElectricFile.getBillList(BILL_PATH);
            List<Customer> customerList = ReadElectricFile.getListCustomer(CUSTOMER_FILE_PATH);
            boolean flag = true;
            boolean check = true;
            int typeCustomer = 0;
            int limitOfCountrycustomer = 0;
            String customerCode = "";
            while (flag) {
                int i = 1;
                System.out.println("List customer: ");
                for (Customer customer : customerList) {
                    System.out.println("Customer 1 " + i + " : " + customer.toString());
                    i++;
                }
                System.out.println("Enter customer code:");
                do {
                    customerCode = input.nextLine();
                } while (!VldElectric.vldCodeCustomer(customerCode));
                for (Customer customer : customerList) {
                    if (customer.getCustomerCode().equals(customerCode)) {
                        if (customer instanceof CountryCustomer) {
                            limitOfCountrycustomer = Integer.parseInt(((CountryCustomer) customer).getLimitEmployment());
                        }
                        if (customer instanceof OtherCustomer) {
                            typeCustomer = 1;
                        }
                        check = false;
                        flag = false;
                        break;
                    }
                }
                if (check) {
                    System.err.println("Please enter again, customer code is not exist !");
                }
            }
            String billCode = "";
            do {
                billCode = getBillCode();
            }
            while (!VldElectric.vldCodeBill(billCode));
            String date = "";
            do {
                System.out.println("Enter day output of bill");
                date = input.nextLine();
            } while (!VldElectric.vldDate(date));
            int numberOfKW = 0;
            do {
                System.out.println("Enter number of KW");
                numberOfKW = Integer.parseInt(input.nextLine());
            }
            while (!VldElectric.vldNumber(numberOfKW));
            int price;
            do {
                System.out.println("Enter price ");
                price = Integer.parseInt(input.nextLine());
            } while (!VldElectric.vldNumber(price));
            double money = 0;
            if (typeCustomer == 1) {
                money = price * numberOfKW;
            }
            if (typeCustomer == 0) {
                if (numberOfKW < limitOfCountrycustomer) {
                    money = price * numberOfKW;
                } else {
                    money = ((price * numberOfKW * limitOfCountrycustomer) + (price * (numberOfKW - limitOfCountrycustomer) * 2.5));
                }
            }
            Bill bill = new Bill(billCode, customerCode, date, numberOfKW, price, money);
            billList.add(bill);
            WriteElectricFile.writeBillToCSV(BILL_PATH, billList, false);
            System.out.println("Add bill completed !");

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    //bill code tự tăng:MHD-001, MHD-002,MHD -003
    private String getBillCode() {
        String billCode = "";
        List<Bill> billList = ReadElectricFile.getBillList(BILL_PATH);
        List<String> billCodeList = new LinkedList<>();
        for (Bill bill : billList) {
            billCodeList.add(bill.getBillCode());
        }
        List<Integer> integerList = new ArrayList<>();
        for (String string : billCodeList) {
            String[] array = string.split("-");
            integerList.add(Integer.valueOf(array[1]));

        }
        Collections.sort(integerList);
        if (integerList.get(integerList.size() - 1) > 98) {
            billCode += "MHD-" + (integerList.get(integerList.size() - 1) + 1);
        } else if (integerList.get(integerList.size() - 1) > 8) {
            billCode += "MHD-0" + (integerList.get(integerList.size() - 1) + 1);
        } else if (integerList.get(integerList.size() - 1) > 0) {
            billCode += "MHD-00" + (integerList.get(integerList.size() - 1) + 1);
        }
        return billCode;
    }

    @Override
    public void display() {
        List<Bill> billList = ReadElectricFile.getBillList(BILL_PATH);
        System.out.println("List of bill : ");
        for (Bill bill : billList) {
            System.out.println(bill.toString());
        }

    }

    @Override
    public void edit() {



    }

    @Override
    public void displaydetailedinfo() {
        List<Bill> billList = ReadElectricFile.getBillList(BILL_PATH);
        System.out.println("List bill code: ");
        for(Bill bill:billList){
            System.out.println(bill.getBillCode());
        }
        List<Customer> customerList = ReadElectricFile.getListCustomer(CUSTOMER_FILE_PATH);
        boolean check=true;
        String codeBill = "";
        do {
            System.out.println("Enter code bill of your choose");
            codeBill = input.nextLine();
        } while (!VldElectric.vldCodeBill(codeBill));

        for (Bill bill : billList) {
            if (bill.getBillCode().equals(codeBill)) {
                check=false;
                String codeCustomer = bill.getCustomerCode();
                System.out.println("Info of customer :");
                for (Customer customer : customerList) {
                    if (customer.getCustomerCode().equals(codeCustomer)) {
                        customer.setCustomerCode("XXXX");
                        System.out.println(customer.toString());
                    }
                }
                bill.setCustomerCode("XXXX");
                System.out.println(bill.toString());

            }
        }
        if(check){
            System.err.println("Your input code of bill is not exist !");
        }
    }
}
