package _bai_tap_them.bai_2.util;

import _bai_tap_them.bai_2.model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadElectricFile {
        private static List<String> readFromCSV(String path) {
            List<String> stringList = new ArrayList<>();
            File file = new File(path);
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringList;
        }
        public static List<TypeOfCustomer> getListTypeOfCustomer(String path){
            List<String > stringList =readFromCSV(path);
            List<TypeOfCustomer> typeOfCustomers = new LinkedList<>();
            for(String string : stringList){
                String [] array= string.split(",");
                TypeOfCustomer typeOfCustomer = new TypeOfCustomer(array[0],array[1]);
                typeOfCustomers.add(typeOfCustomer);
            }
            return typeOfCustomers;
        }
        public static List<Customer> getListCustomer(String path){
            List<String> stringList = readFromCSV(path);
            List<Customer> customerList = new ArrayList<>();
            for(String string:stringList){
                String[] array = string.split(",");
                if(array[0].equals("Country")){
                    CountryCustomer customer = new CountryCustomer(array[1],array[2],array[3],array[4]);
                    customerList.add(customer);
                }
                if(array[0].equals("Other")){
                    OtherCustomer customer=new OtherCustomer(array[1],array[2],array[3]);
                    customerList.add(customer);
                }
            }
            return customerList;
        }
    public static Map<Customer,Integer> getCustomerMap(String path){
            List<String> stringList = readFromCSV(path);
            Map<Customer,Integer> customerMap = new LinkedHashMap<>();
            for(String string : stringList){
                String[] arrayString = string.split(",");
                if(arrayString[0].equals("Country")){
                   Customer customer = new CountryCustomer(arrayString[1],arrayString[2],arrayString[3],arrayString[4]);
                    customerMap.put(customer,Integer.parseInt(arrayString[5]));
                }
                if(arrayString[0].equals("Other")){
                    Customer customer = new OtherCustomer(arrayString[1],arrayString[2],arrayString[3]);
                    customerMap.put(customer,Integer.parseInt(arrayString[4]));
                }
            }
            return customerMap;
    }
    public static List<Bill> getBillList(String path) {
        List<String > stringList =readFromCSV(path);
        List<Bill> billList = new ArrayList<>();
        for(String string : stringList){
            String [] array= string.split(",");
            Bill bill = new Bill (array[0],array[1],array[2],
                    Integer.parseInt(array[3]),Integer.parseInt(array[4]),Double.parseDouble(array[5]));
            billList.add(bill);
        }
        return billList;
    }

}
