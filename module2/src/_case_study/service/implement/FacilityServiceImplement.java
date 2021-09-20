package _case_study.service.implement;

import _case_study.controller.FuramaController;
import _case_study.model.*;
import _case_study.service.FacilityService;
import _case_study.utils.ReadFile;
import _case_study.utils.Validate;
import _case_study.utils.WriteFile;

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
                System.out.println("This" + key + "service has been used 5 times, needs maintenance !");
            }
        }
    }

    public void addemployment(String idService, String path) {
        Map<Facility, Integer> facilityIntegerMap = ReadFile.getFacilityMap(path);
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            if (entry.getKey().getIdService().equals(idService)) {
                entry.setValue(entry.getValue() + 1);
            }
        }
        WriteFile.writeFacilityToCSV(path, facilityIntegerMap, false);
    }

    @Override
    public void addVilla(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);

        String idService = getIdService(facilitiMap);

        try {
            String nameOfService;
            do {
                System.out.println("Enter name of service:");
                nameOfService = input.nextLine();
            }
            while (!Validate.validateNameService(nameOfService));

            double areaOfService;
            do {
                System.out.println("Enter area of villa (m2):");
                areaOfService = Double.parseDouble(input.nextLine());
            }
            while (!Validate.validateArea(areaOfService));
            int costOfService;
            do {
                System.out.println("Enter cost of villa($): ");
                costOfService = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateCost(costOfService));
            int numberOfPeople;
            do {
                System.out.println("Enter the number of people of villa: ");
                numberOfPeople = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateNumberOfPeople(numberOfPeople));
            String rentalType;
            do {
                rentalType = chooseRentalType();
            }
            while (!Validate.validateRentalType(rentalType));
            String roomStandar;
            do {
                System.out.println("Enter room standard of villa:");
                roomStandar = input.nextLine();
            }
            while (Validate.validateRoomStandard(roomStandar));
            double poolArea;
            do {
                System.out.println("Enter area of pool(m2):");
                poolArea = Double.parseDouble(input.nextLine());
            }
            while (!Validate.validatePoolArea(poolArea));
            int numberOfFloor;
            do {
                System.out.println("Enter the number of floors of villa:");
                numberOfFloor = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateNumberOfFloor(numberOfFloor));
            Facility villa = new Villa(idService, nameOfService, areaOfService, costOfService, numberOfPeople, rentalType, roomStandar, poolArea, numberOfFloor);
            facilitiMap.put(villa, 0);
            WriteFile.writeFacilityToCSV(path, facilitiMap, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addHouse(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        String idService= getIdService(facilitiMap);

        try {
            String nameOfService;
            do {
                System.out.println("Enter name of service:");
                nameOfService = input.nextLine();
            }
            while (!Validate.validateNameService(nameOfService));
            double areaOfService;
            do {
                System.out.println("Enter area of house:");
                areaOfService = Double.parseDouble(input.nextLine());
            }
            while (!Validate.validateArea(areaOfService));
            int costOfService;
            do {
                System.out.println("Enter cost of house: ");
                costOfService = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateCost(costOfService));
            int numberOfPeople;
            do {
                System.out.println("Enter the number of people of house: ");
                numberOfPeople = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateNumberOfPeople(numberOfPeople));
            String rentalType;
            do{
             rentalType = chooseRentalType();}
            while(!Validate.validateRentalType(rentalType));
            String roomStandar;
            do{
            System.out.println("Enter room standard of house:");
             roomStandar = input.nextLine();}
            while(Validate.validateRoomStandard(roomStandar));
            int numberOfFloor;
            do{
            System.out.println("Enter the number of floors of house:");
             numberOfFloor = Integer.parseInt(input.nextLine());}
            while(!Validate.validateNumberOfFloor(numberOfFloor));
            Facility house = new House(idService, nameOfService, areaOfService, costOfService, numberOfPeople, rentalType, roomStandar, numberOfFloor);
            facilitiMap.put(house, 0);
            WriteFile.writeFacilityToCSV(path, facilitiMap, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addRoom(String path) {
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        String idService = getIdService(facilitiMap);

        try {
            String nameOfService;
            do {
                System.out.println("Enter name of service:");
                nameOfService = input.nextLine();
            }
            while (!Validate.validateNameService(nameOfService));
            double areaOfService;
            do {
                System.out.println("Enter area of room:");
                areaOfService = Double.parseDouble(input.nextLine());
            }
            while (!Validate.validateArea(areaOfService));
            int costOfService;
            do {
                System.out.println("Enter cost of room: ");
                costOfService = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateCost(costOfService));
            int numberOfPeople;
            do {
                System.out.println("Enter the number of people of room: ");
                numberOfPeople = Integer.parseInt(input.nextLine());
            }
            while (!Validate.validateNumberOfPeople(numberOfPeople));
            String rentalType;
            do {
                rentalType = chooseRentalType();
            }
            while (!Validate.validateRentalType(rentalType));

            System.out.println("Enter extra service of room:");
            String extraService = input.nextLine();

            Facility room = new Room(idService, nameOfService, areaOfService, costOfService, numberOfPeople, rentalType, extraService);
            facilitiMap.put(room, 0);
            WriteFile.writeFacilityToCSV(path, facilitiMap, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            System.out.println("Service: " + key + " " + "\n"
                    + " Number of uses service: " + facilitiMap.get(key));
        }
    }

    @Override
    public void edit(String path) {
        display(path);
        Map<Facility, Integer> facilitiMap = ReadFile.getFacilityMap(path);
        Set<Facility> keySet = facilitiMap.keySet();
        String idService = "";
        boolean flag = true;
        boolean check = true;
        while (flag) {
            try {
                System.out.println("Enter id of service you want to edit");
                idService = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
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
        WriteFile.writeFacilityToCSV(path, facilitiMap, false);
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
                String name = "";
                try {
                    System.out.println("Enter new  name of service");
                    name = input.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                key.setNameService(name);
                break;
            case "2":
                double area = 0d;
                try {
                    System.out.println("Enter new area of Villa");
                    area = Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setArea(area);
                break;
            case "3":
                int cost = 0;
                try {
                    System.out.println("Enter cost of Villa");
                    cost = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setCost(cost);
                break;
            case "4":
                int numberOfPeople = 0;
                try {
                    System.out.println("Enter number of people of Villa");
                    numberOfPeople = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setNumberOfPeople(numberOfPeople);
                break;
            case "5":
                String rentalType = chooseRentalType();
                key.setRentalType(rentalType);
                break;
            case "6":
                String roomStandar = "";
                try {
                    System.out.println("Enter room standard of villa:");
                    roomStandar = input.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ((Villa) key).setVillaStandar(roomStandar);
                break;
            case "7":
                double poolArea = 0d;
                try {
                    System.out.println("Enter area of pool:");
                    poolArea = Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                ((Villa) key).setPoolArea(poolArea);
                break;
            case "8":
                int numberOfFloor = 0;
                try {
                    System.out.println("Enter the number of floors of villa:");
                    numberOfFloor = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
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
                String name = "";
                try {
                    System.out.println("Enter new  name of service");
                    name = input.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                key.setNameService(name);
                break;
            case "2":
                double area = 0d;
                try {
                    System.out.println("Enter new area of House");
                    area = Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setArea(area);
                break;
            case "3":
                int cost = 0;
                try {
                    System.out.println("Enter cost of House");
                    cost = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setCost(cost);
                break;
            case "4":
                int numberOfPeople = 0;
                try {
                    System.out.println("Enter number of people of House");
                    numberOfPeople = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setNumberOfPeople(numberOfPeople);
                break;
            case "5":
                String rentalType = chooseRentalType();
                key.setRentalType(rentalType);
                break;
            case "6":
                String roomStandar = "";
                try {
                    System.out.println("Enter room standard of House:");
                    roomStandar = input.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ((House) key).setHouseStandar(roomStandar);
                break;
            case "7":
                int numberOfFloor = 0;
                try {
                    System.out.println("Enter the number of floors of House:");
                    numberOfFloor = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
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
                String name = "";
                try {
                    System.out.println("Enter new  name of service");
                    name = input.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                key.setNameService(name);
                break;
            case "2":
                double area = 0d;
                try {
                    System.out.println("Enter new area of Room");
                    area = Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setArea(area);
                break;
            case "3":
                int cost = 0;
                try {
                    System.out.println("Enter cost of Room");
                    cost = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setCost(cost);
                break;
            case "4":
                int numberOfPeople = 0;
                try {
                    System.out.println("Enter number of people of Room");
                    numberOfPeople = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                key.setNumberOfPeople(numberOfPeople);
                break;
            case "5":
                String rentalType = chooseRentalType();
                key.setRentalType(rentalType);
                break;
            case "6":
                String extraService = "";
                try {
                    System.out.println("Enter room standard of Room:");
                    extraService = input.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ((Room) key).setExtraService(extraService);
                break;
            case "0":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chooseRoom);
        }
    }

    private String chooseRentalType() {
        String rentalType;
        System.out.println("Choose rental type: "
                + "1.Year \n"
                + "2.Month \n"
                + "3.Day \n"
                + "4.Hour "
        );
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                rentalType = "Year";
                break;
            case "2":
                rentalType = "Month";
                break;
            case "3":
                rentalType = "Day";
                break;
            case "4":
                rentalType = "Hour";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        return rentalType;
    }
    private String getIdService(Map<Facility,Integer> map){
        Set<Facility> keySet = map.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println("Enter new id service(SVXX-YYYY)");
                    idService = input.nextLine();
                }
                while (!Validate.validateCodeService(idService));
            } catch (Exception e) {
                e.printStackTrace();
            }
            flag = false;
            for (Facility key : keySet) {
                if (key.getIdService().equals(idService)) {
                    System.out.println("Id service is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        return idService;
    }
}
