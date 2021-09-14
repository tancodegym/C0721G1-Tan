package _case_study.service.implement;

import _case_study.controller.FuramaController;
import _case_study.model.*;
import _case_study.service.FacilityService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public  class FacilityServiceImplement implements FacilityService {
    Scanner input = new Scanner(System.in);

    @Override
    public void displayListMaintenance(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        for (Facility key : keySet) {
            if (facilitiMap.get(key) >= 5) {
                System.out.println("This" + key + "service has been used 5 times, needs maintenance :");
            }
        }
    }
    public void addemployment(String nameService, String path){
        Map<Facility, Integer> facilityIntegerMap = ReadFile.getFacilityMap(path);
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            if (entry.getKey().getNameService().equals(nameService)) {
                entry.setValue(entry.getValue() + 1);
            }
        }
        WriteFile.writeFacilityToCSV(path,facilityIntegerMap,false);
    }

    @Override
    public void addVilla(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new id service");
            idService = input.nextLine();
            flag = false;
            for (Facility key : keySet) {
                if (key.getIdService().equals(idService)) {
                    System.out.println("Id service is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of service:");
        String nameOfService = input.nextLine();
        System.out.println("Enter area of villa:");
        double areaOfService = Double.parseDouble(input.nextLine());
        System.out.println("Enter cost of villa: ");
        int costOfService = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of people of villa: ");
        int numberOfPeople = Integer.parseInt(input.nextLine());
        System.out.println("Enter rental type of villa:");
        String rentalType = input.nextLine();
        System.out.println("Enter room standard of villa:");
        String roomStandar = input.nextLine();
        System.out.println("Enter area of pool:");
        double poolArea = Double.parseDouble(input.nextLine());
        System.out.println("Enter the number of floors of villa:");
        int numberOfFloor = Integer.parseInt(input.nextLine());
        Facility villa = new Villa(idService, nameOfService, areaOfService, costOfService, numberOfPeople, rentalType, roomStandar, poolArea, numberOfFloor);
        facilitiMap.put(villa, 0);
        WriteFile.writeFacilityToCSV(path,facilitiMap,false);
    }

    @Override
    public void addHouse(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new id service");
            idService = input.nextLine();
            flag = false;
            for (Facility key : keySet) {
                if (key.getIdService().equals(idService)) {
                    System.out.println("Id service is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of service:");
        String nameOfService = input.nextLine();
        System.out.println("Enter area of house:");
        double areaOfService = Double.parseDouble(input.nextLine());
        System.out.println("Enter cost of house: ");
        int costOfService = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of people of house: ");
        int numberOfPeople = Integer.parseInt(input.nextLine());
        System.out.println("Enter rental type of house:");
        String rentalType = input.nextLine();
        System.out.println("Enter room standard of house:");
        String roomStandar = input.nextLine();
        System.out.println("Enter the number of floors of house:");
        int numberOfFloor = Integer.parseInt(input.nextLine());
        Facility house = new House(idService, nameOfService, areaOfService, costOfService, numberOfPeople, rentalType, roomStandar, numberOfFloor);
        facilitiMap.put(house, 0);
        WriteFile.writeFacilityToCSV(path,facilitiMap,false);
    }

    @Override
    public void addRoom(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new id service");
            idService = input.nextLine();
            flag = false;
            for (Facility key : keySet) {
                if (key.getIdService().equals(idService)) {
                    System.out.println("Id service is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of service:");
        String nameOfService = input.nextLine();
        System.out.println("Enter area of room:");
        double areaOfService = Double.parseDouble(input.nextLine());
        System.out.println("Enter cost of room: ");
        int costOfService = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of people of room: ");
        int numberOfPeople = Integer.parseInt(input.nextLine());
        System.out.println("Enter rental type of room:");
        String rentalType = input.nextLine();
        System.out.println("Enter extra service of room:");
        String extraService = input.nextLine();

        Facility room = new Room(idService, nameOfService, areaOfService, costOfService, numberOfPeople, rentalType, extraService);
        facilitiMap.put(room, 0);
        WriteFile.writeFacilityToCSV(path,facilitiMap,false);
    }


    @Override
    public void add(String path) {

        System.out.println("Menu Add Facility Service\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "Other.\tBack to Menu\n" +
                "Enter your choose :");
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                addVilla(path);
                break;
            case "2":
                addHouse(path);
                break;
            case "3":
                addRoom(path);
                break;
            default:
                FuramaController.displayMenuFacilityManagement(input);
                break;
        }

    }

    @Override
    public void display(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        for (Facility key : keySet) {
            System.out.println(key + " " + facilitiMap.get(key));
        }
    }
    @Override
    public void edit(String path) {
        display(path);
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        String idService;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter id of service you want to edit");
            idService = input.nextLine();
            flag = false;
            for (Facility key : keySet) {
                if (key.getIdService().equals(idService)) {
                    if (key instanceof Villa) {
                        menuEditVilla(key);
                    }
                    if (key instanceof House) {
                        menuEditHouse(key);
                    }
                    if (key instanceof Room) {
                        menuEditRoom(key);
                    }
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Id service is not exist, please enter again !");
                flag = true;
            }
        }
        WriteFile.writeFacilityToCSV(path,facilitiMap,false);
    }

    void menuEditVilla(Facility key) {
        System.out.println("---Menu Edit Of Villa---\n"
                + "1. Edit name of service \n"
                + "2. Edit area of Villa \n"
                + "3. Edit cost of Villa \n"
                + "4. Edit number of people of Villa \n"
                + "5. Edit rentalType of Villa \n"
                + "6. Edit  Standar of Villa \n"
                + "7. Edit pool area of Villa \n"
                + "8. Edit number of floor of Villa \n"
                + "0. Exit menu edit\n"
                + "Enter your choose: ");
        String chooseVilla = input.nextLine();
        switch (chooseVilla) {
            case "1":
                System.out.println("Enter new  name of service");
                String name = input.nextLine();
                key.setNameService(name);
                break;
            case "2":
                System.out.println("Enter new area of Villa");
                double area = Double.parseDouble(input.nextLine());
                key.setArea(area);
                break;
            case "3":
                System.out.println("Enter cost of Villa");
                int cost = Integer.parseInt(input.nextLine());
                key.setCost(cost);
                break;
            case "4":
                System.out.println("Enter number of people of Villa");
                int numberOfPeople = Integer.parseInt(input.nextLine());
                key.setNumberOfPeople(numberOfPeople);
                break;
            case "5":
                System.out.println("Enter rental type of villa:");
                String rentalType = input.nextLine();
                key.setRentalType(rentalType);
                break;
            case "6":
                System.out.println("Enter room standard of villa:");
                String roomStandar = input.nextLine();
                ((Villa) key).setVillaStandar(roomStandar);
                break;
            case "7":
                System.out.println("Enter area of pool:");
                double poolArea = Double.parseDouble(input.nextLine());
                ((Villa) key).setPoolArea(poolArea);
                break;
            case "8":
                System.out.println("Enter the number of floors of villa:");
                int numberOfFloor = Integer.parseInt(input.nextLine());
                ((Villa) key).setNumberOfFloor(numberOfFloor);
                break;
            case "0":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chooseVilla);
        }
    }

    void menuEditHouse(Facility key) {
        System.out.println("---Menu Edit Of Villa---\n"
                + "1. Edit name of service \n"
                + "2. Edit area of House \n"
                + "3. Edit cost of House \n"
                + "4. Edit number of people of House \n"
                + "5. Edit rentalType of House \n"
                + "6. Edit  Standar of House \n"
                + "7. Edit number of floor of House \n"
                + "0. Exit menu edit\n"
                + "Enter your choose: ");
        String chooseHouse = input.nextLine();
        switch (chooseHouse) {
            case "1":
                System.out.println("Enter new  name of service");
                String name = input.nextLine();
                key.setNameService(name);
                break;
            case "2":
                System.out.println("Enter new area of House");
                double area = Double.parseDouble(input.nextLine());
                key.setArea(area);
                break;
            case "3":
                System.out.println("Enter cost of House");
                int cost = Integer.parseInt(input.nextLine());
                key.setCost(cost);
                break;
            case "4":
                System.out.println("Enter number of people of House");
                int numberOfPeople = Integer.parseInt(input.nextLine());
                key.setNumberOfPeople(numberOfPeople);
                break;
            case "5":
                System.out.println("Enter rental type of House:");
                String rentalType =input.nextLine();
                key.setRentalType(rentalType);
                break;
            case "6":
                System.out.println("Enter room standard of House:");
                String roomStandar = input.nextLine();
                ((House) key).setHouseStandar(roomStandar);
                break;
            case "7":
                System.out.println("Enter the number of floors of House:");
                int numberOfFloor = Integer.parseInt(input.nextLine());
                ((House) key).setNumberOfFloor(numberOfFloor);
                break;
            case "0":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chooseHouse);

        }
    }

    void menuEditRoom(Facility key) {
        System.out.println("---Menu Edit Of Villa---\n"
                + "1. Edit name of service \n"
                + "2. Edit area of Room \n"
                + "3. Edit cost of Room \n"
                + "4. Edit number of people of Room \n"
                + "5. Edit rentalType of Room \n"
                + "6. Edit  Extra Service of Room \n"
                + "0. Exit menu edit\n"
                + "Enter your choose: ");
        String chooseRoom = input.nextLine();
        switch (chooseRoom) {
            case "1":
                System.out.println("Enter new  name of service");
                String name = input.nextLine();
                key.setNameService(name);
                break;
            case "2":
                System.out.println("Enter new area of Room");
                double area = Double.parseDouble(input.nextLine());
                key.setArea(area);
                break;
            case "3":
                System.out.println("Enter cost of Room");
                int cost = Integer.parseInt(input.nextLine());
                key.setCost(cost);
                break;
            case "4":
                System.out.println("Enter number of people of Room");
                int numberOfPeople = Integer.parseInt(input.nextLine());
                key.setNumberOfPeople(numberOfPeople);
                break;
            case "5":
                System.out.println("Enter rental type of Room:");
                String rentalType = input.nextLine();
                key.setRentalType(rentalType);
                break;
            case "6":
                System.out.println("Enter room standard of Room:");
                String extraService =  input.nextLine();
                ((Room) key).setExtraService(extraService);
                break;
            case "0":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chooseRoom);
        }
    }
}
