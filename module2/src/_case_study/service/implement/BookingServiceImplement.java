package _case_study.service.implement;

import _case_study.model.*;
import _case_study.service.BookingService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;

import java.util.*;

public class BookingServiceImplement implements BookingService {
    static final String CUSTOMER_FILE_PATH = "src\\_case_study\\data\\customer.csv";
    static final String FACILITY_FILE_PATH = "src\\_case_study\\data\\facility.csv";
    static final String CONTRACT_FILE_PATH = "src\\_case_study\\data\\contract.csv";

    Scanner input = new Scanner(System.in);

    private String getCustomerCode() {
        List<Customer> customerList = ReadFile.getListCustomer(CUSTOMER_FILE_PATH);
        int i = 1;
        for (Customer customer : customerList) {
            System.out.println(+i + " : " + customer.getCustomerString());
            i++;
        }
        String customerCode = "";
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter the employee code of your choice");
            customerCode = input.nextLine();
            for (Customer customer : customerList) {
                if (customer.getCustomerCode().equals(customerCode)) {
                    flag = false;
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("You entered wrong ,please enter again !");
            }
        }
        return customerCode;
    }

    private String getNameService() {
        Map<Facility, Integer> facilityIntegerMap = ReadFile.getFacilityMap(FACILITY_FILE_PATH);
        Set<Facility> keySet = facilityIntegerMap.keySet();
        int j = 1;
        for (Facility key : keySet) {
            System.out.println(j + " : " + key.getNameService());
            j++;
        }
        String nameService = "";
        boolean flag1 = true;
        boolean check1 = true;
        while (flag1) {
            System.out.println("Enter the employee code of your choice");
            nameService = input.nextLine();
            for (Facility key : keySet) {
                if (key.getNameService().equals(nameService)) {
                    flag1 = false;
                    check1 = false;
                    break;
                }
            }
            if (check1) {
                System.out.println("You entered wrong ,please enter again !");
            }
        }
        return nameService;
    }

    private String getServiceType(String nameService) {
        String serviceType = "";
        Map<Facility, Integer> facilityIntegerMap = ReadFile.getFacilityMap(FACILITY_FILE_PATH);
        Set<Facility> keySet = facilityIntegerMap.keySet();
        for (Facility key : keySet) {
            if (key.getNameService().equals(nameService)) {
               if(key instanceof Villa){
                   serviceType= "Villa";
               }
               if(key instanceof House){
                   serviceType="House";
               }
               if(key instanceof Room){
                   serviceType= "Room";
               }
            }
        }
        return serviceType;
    }

    @Override
    public void add(String path) {
        TreeSet<Booking> bookingTreeSet = ReadFile.getBookingSet(path);
        String customerCode = getCustomerCode();
        String nameService = getNameService();
        String bookingCode = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter new booking code");
            bookingCode = input.nextLine();
            flag = false;
            for (Booking booking : bookingTreeSet) {
                if (booking.getBookingCode().equals(bookingCode)) {
                    System.out.println("Booking code is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter start date");
        String startDate = input.nextLine();
        System.out.println("Enter end date");
        String endDate = input.nextLine();
        String serviceType = getServiceType(nameService);
        System.out.println(serviceType);
        Booking booking = new Booking(bookingCode, startDate, endDate, nameService, customerCode, serviceType);
        bookingTreeSet.add(booking);
        System.out.println("Add booking completed !");


        //Tăng số lần sử dụng facility khi booking thành công .
        FacilityServiceImplement facilityServiceImplement = new FacilityServiceImplement();
        facilityServiceImplement.addemployment(nameService, FACILITY_FILE_PATH);
        WriteFile.writeBookingToCSV(path, bookingTreeSet, false);
        display(path);


        //add booking to queue.
        String bookingQueuePath = "src\\_case_study\\data\\bookingQueue.csv";
        Queue<Booking> queueBooking = ReadFile.getBookingQueue(bookingQueuePath);
        for (Booking booking1 : bookingTreeSet) {
            if(booking1.getServiceType().equals("Villa")||booking1.getServiceType().equals("House")){
                queueBooking.add(booking1);
            }
        }
        WriteFile.writeBookingQueueToCSV(bookingQueuePath, queueBooking, false);

    }

    @Override
    public void display(String path) {
        TreeSet<Booking> bookingTreeSet = ReadFile.getBookingSet(path);
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void edit(String path) {
        TreeSet<Booking> bookingTreeSet = ReadFile.getBookingSet(path);
        int i = 1;
        for (Booking booking : bookingTreeSet) {
            System.out.println(i + " : " + booking.getBookingCode());
            i++;
        }
        String bookingCode;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter code of booking you want to edit:");
            bookingCode = input.nextLine();
            flag = false;
            for (Booking booking : bookingTreeSet) {
                if (booking.getBookingCode().equals(bookingCode)) {
                    System.out.println("---Menu Edit Booking---\n"
                            + "1. Edit code of booking \n"
                            + "2. Edit start day of booking \n"
                            + "3. Edit end day of booking \n"
                            + "4. Edit service name of facility \n"
                            + "5. Edit service type of booking \n"
                            + "6. Edit code of customer \n"
                            + "0. Exit menu edit\n"
                            + "Enter your choose: ");
                    String choose = input.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("Enter new booking code");
                            bookingCode = input.nextLine();
                            booking.setBookingCode(bookingCode);
                            break;
                        case "2":
                            System.out.println("Enter start day of booking");
                            String startDate = input.nextLine();
                            booking.setStartDate(startDate);
                            break;
                        case "3":
                            System.out.println("Enter end day of booking");
                            String endDate = input.nextLine();
                            booking.setEndDate(endDate);
                            break;
                        case "4":
                            System.out.println("Enter service name of facility of Booking");
                            String serviceName = input.nextLine();
                            booking.setServiceName(serviceName);
                            break;
                        case "5":
                            System.out.println("Enter type of service of booking");
                            String serviceType = input.nextLine();
                            booking.setServiceType(serviceType);
                            break;
                        case "6":
                            System.out.println("Enter code of customer");
                            String customerCode = input.nextLine();
                            booking.setCustomerCode(customerCode);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + choose);
                    }
                    check = false;
                    break;
                }
                if (check) {
                    System.out.println("Code booking does not exist, please re-enter another code !");
                    flag = true;
                }
            }
        }
        WriteFile.writeBookingToCSV(path, bookingTreeSet, false);
        display(path);
    }

}

