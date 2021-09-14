package _case_study.utils;

import _case_study.model.*;

import java.io.*;
import java.util.*;

public class ReadFile {
    private static List<String> readFromCSV(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Employee> getListEmployee(String path) {
        List<String> listString = readFromCSV(path);
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < listString.size(); i++) {
            String[] array = listString.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3],
                    array[4], array[5], array[6], array[7], new Level(array[8]), new Position(array[9]), Integer.parseInt(array[10]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static List<Customer> getListCustomer(String path) {
        List<String> listString = readFromCSV(path);
        List<Customer> customerList = new LinkedList<>();
        for (int i = 0; i < listString.size(); i++) {
            String[] array = listString.get(i).split(",");
            Customer customer = new Customer(array[0], array[1], array[2], array[3],
                    array[4], array[5], array[6], array[7], new CustomerType(array[8]));
            customerList.add(customer);
        }
        return customerList;
    }
    public static TreeSet<Booking> getBookingSet(String path){
        List<String> stringList = readFromCSV(path);
        TreeSet<Booking> bookingTreeSet = new TreeSet<>();
        for(int i =0;i<stringList.size();i++){
            String[] array = stringList.get(i).split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3],
                    array[4], array[5]);
            bookingTreeSet.add(booking);
        }
        return bookingTreeSet;
    }
    public static Queue<Booking> getBookingQueue(String path){
        List<String> stringList = readFromCSV(path);
        Queue<Booking> bookingQueue = new LinkedList<>();
        for(int i =0;i<stringList.size();i++){
            String[] array = stringList.get(i).split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3],
                    array[4], array[5]);
            bookingQueue.add(booking);
        }
        return bookingQueue;
    }
    public static Set<Contract> getContractSet(String path){
        List<String> stringList = readFromCSV(path);
        Set<Contract> contractSet = new TreeSet<>();
        for(int i =0;i<stringList.size();i++){
            String[] array = stringList.get(i).split(",");
            Contract contract = new Contract(Integer.parseInt(array[0]), array[1]
                    , Integer.parseInt(array[2]), Integer.parseInt(array[3]),
                    array[4]);
            contractSet.add(contract);
        }
        return contractSet;
    }
    public static Map<Facility,Integer> getFacilityMap(String path){
        List<String> listString = readFromCSV(path);
        Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
        for(int i=0;i<listString.size();i++){
            String[] array = listString.get(i).split(",");
            if(array[0].equals("Villa")){
                Facility villa = new Villa(array[1],array[2], Double.parseDouble(array[3]), Integer.parseInt(array[4]),
                    Integer.parseInt(array[5]), new RentalType(array[6]), new RoomStandar(array[7]),
                    Double.parseDouble(array[8]), Integer.parseInt(array[9]));
                facilityMap.put(villa,Integer.parseInt(array[10]));
            }
            if(array[0].equals("House")){
                Facility house = new House(array[1],array[2], Double.parseDouble(array[3]), Integer.parseInt(array[4]),
                    Integer.parseInt(array[5]), new RentalType(array[6]), new RoomStandar(array[7]),
                    Integer.parseInt(array[8]));
                facilityMap.put(house,Integer.parseInt(array[9]));
            }
            if(array[0].equals("Room")){
                Facility room = new Room(array[1],array[2], Double.parseDouble(array[3]), Integer.parseInt(array[4]),
                    Integer.parseInt(array[5]), new RentalType(array[6]), new ExtraService(array[7]));
                facilityMap.put(room,Integer.parseInt(array[8]));
            }
        }
        return facilityMap;
    }
//    public static Map<Villa,Integer> getVillaMap(String path) {
//        List<String> listString = readFromCSV(path);
//        Map<Villa,Integer> villaMap = new LinkedHashMap<>();
//        for (int i = 0; i < listString.size(); i++) {
//            String[] array = listString.get(i).split(",");
//            Villa villa = new Villa(array[0],array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
//                    Integer.parseInt(array[4]), new RentalType(array[5]), new RoomStandar(array[6]),
//                    Double.parseDouble(array[7]), Integer.parseInt(array[8]));
//            villaMap.put(villa,Integer.parseInt(array[9]));
//        }
//        return villaMap;
//    }
//    public static Map<House,Integer> getHouseMap(String path) {
//        List<String> listString = readFromCSV(path);
//        Map<House,Integer> houseMap = new LinkedHashMap<>();
//        for (int i = 0; i < listString.size(); i++) {
//            String[] array = listString.get(i).split(",");
//            House house = new House(array[0],array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
//                    Integer.parseInt(array[4]), new RentalType(array[5]), new RoomStandar(array[6]),
//                    Integer.parseInt(array[7]));
//            houseMap.put(house,Integer.parseInt(array[8]));
//        }
//        return houseMap;
//    }
//    public static Map<Room,Integer> getRoomMap(String path) {
//        List<String> listString = readFromCSV(path);
//        Map<Room,Integer> roomMap = new LinkedHashMap<>();
//        for (int i = 0; i < listString.size(); i++) {
//            String[] array = listString.get(i).split(",");
//            Room room = new Room(array[0],array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
//                    Integer.parseInt(array[4]), new RentalType(array[5]), new ExtraService(array[6]));
//            roomMap.put(room,Integer.parseInt(array[7]));
//        }
//        return roomMap;
//    }

}
