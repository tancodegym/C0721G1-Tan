package _bai_tap_them.bai_2.util;

import _bai_tap_them.bai_2.model.Bill;
import _bai_tap_them.bai_2.model.CountryCustomer;
import _bai_tap_them.bai_2.model.Customer;
import _bai_tap_them.bai_2.model.OtherCustomer;
import _case_study.model.Facility;
import _case_study.model.House;
import _case_study.model.Room;
import _case_study.model.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteElectricFile {
    private static void writeToFile(String path, List<String> list, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCustomerListToCSV(String path, List<Customer> customerList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer instanceof CountryCustomer) {
                stringList.add("Country"+","+((CountryCustomer) customer).getCountryCustomerString() );
            }
            if(customer instanceof OtherCustomer){
                stringList.add("Other"+","+(((OtherCustomer) customer).getOtherCustomerString()));
            }
            writeToFile(path, stringList, append);
        }
    }

    public static void writeCustomerToCSV(String path, Map<Customer, Integer> customerMap, boolean append) {
        List<String> stringList = new ArrayList<>();
        Set<Customer> customerSet = customerMap.keySet();
        for (Customer customer : customerSet) {
            if (customer instanceof CountryCustomer)
                stringList.add("Country" + "," + ((CountryCustomer) customer).getCountryCustomerString() + "," + customerMap.get(customer));
            if (customer instanceof OtherCustomer)
                stringList.add("Other" + "," + ((OtherCustomer) customer).getOtherCustomerString() + "," + customerMap.get(customer));
        }
        writeToFile(path, stringList, append);
    }

    public static void writeBillToCSV(String path, List<Bill> billList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Bill bill : billList) {
            stringList.add(bill.getString());
        }
        writeToFile(path, stringList, append);
    }

}
