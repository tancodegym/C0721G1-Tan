package _case_study.service.implement;

import _case_study.controller.FuramaController;
import _case_study.model.*;
import _case_study.service.FacilityService;
import _case_study.utils.ReadFile;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImplement implements FacilityService {
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
                if(key.getIdService().equals(idService)){
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
        RentalType rentalType = new RentalType(input.nextLine());
        System.out.println("Enter room standard of villa:");
        RoomStandar roomStandar = new RoomStandar(input.nextLine());
        System.out.println("Enter area of pool:");
        double poolArea = Double.parseDouble(input.nextLine());
        System.out.println("Enter the number of floors of villa:");
        int numberOfFloor = Integer.parseInt(input.nextLine());
        Facility villa = new Villa(idService,nameOfService,areaOfService,costOfService,numberOfPeople,rentalType,roomStandar,poolArea,numberOfFloor);
        facilitiMap.put(villa,0);
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
                if(key.getIdService().equals(idService)){
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
        RentalType rentalType = new RentalType(input.nextLine());
        System.out.println("Enter room standard of house:");
        RoomStandar roomStandar = new RoomStandar(input.nextLine());
        System.out.println("Enter the number of floors of house:");
        int numberOfFloor = Integer.parseInt(input.nextLine());
        Facility house = new House(idService,nameOfService,areaOfService,costOfService,numberOfPeople,rentalType,roomStandar,numberOfFloor);
        facilitiMap.put(house,0);

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
                if(key.getIdService().equals(idService)){
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
        RentalType rentalType = new RentalType(input.nextLine());
        System.out.println("Enter extra service of room:");
        ExtraService extraService = new ExtraService(input.nextLine());

        Facility room = new Room(idService,nameOfService,areaOfService,costOfService,numberOfPeople,rentalType,extraService);
        facilitiMap.put(room,0);
    }


    @Override
    public void addList(String path) {

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
    public void displayList(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        for (Facility key : keySet) {
            System.out.println(key + " " + facilitiMap.get(key));
        }
    }

    @Override
    public void editList(String path) {
    }
}
