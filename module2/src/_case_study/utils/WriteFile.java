package _case_study.utils;

import _case_study.model.*;

import java.io.*;
import java.util.*;

public class WriteFile {
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
    public static void writeEmployeeToCSV(String path, List<Employee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getEmployeeString());
        }
        writeToFile(path, stringList, append);
    }


    public static void writeCustomerToCSV(String path, List<Customer> customerList, boolean append) {
        List<String> stringList = new LinkedList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getCustomerString());
        }
        writeToFile(path, stringList, append);
    }

    public static void writeFacilityToCSV(String path, Map<Facility, Integer> facilityMap, boolean append) {
        List<String> stringList = new ArrayList<>();
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility facility : facilitySet) {
            if(facility instanceof Villa)
            stringList.add( "Villa"+","+((Villa) facility).getVillaString() + "," + facilityMap.get(facility));
            if(facility instanceof House)
                stringList.add("House"+","+ ((House) facility).getHouseString() + "," + facilityMap.get(facility));
            if(facility instanceof Room)
                stringList.add( "Room"+","+((Room) facility).getRoomString() + "," + facilityMap.get(facility));
        }
        writeToFile(path, stringList, append);
    }
//    public static void writerVillaToCSV(String path, Map<Villa, Integer> villaMap, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        Set<Villa> setVilla = villaMap.keySet();
//        for (Villa villa : setVilla) {
//            stringList.add(villa.getVillaString() + "," + villaMap.get(villa));
//        }
//        writeToFile(path, stringList, append);
//    }
//    public static void writerHouseToCSV(String path, Map<House, Integer> houseMap, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        Set<House> setHouse = houseMap.keySet();
//        for (House house : setHouse) {
//            stringList.add(house.getHouseString() + "," + houseMap.get(house));
//        }
//        writeToFile(path, stringList, append);
//    }
//    public static void writerRoomToCSV(String path, Map<Room, Integer> roomMap, boolean append) {
//        List<String> stringList = new ArrayList<>();
//        Set<Room> setRoom = roomMap.keySet();
//        for (Room room : setRoom) {
//            stringList.add(room.getRoomString() + "," + roomMap.get(room));
//        }
//        writeToFile(path, stringList, append);
//    }

}

