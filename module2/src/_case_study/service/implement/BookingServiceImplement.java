package _case_study.service.implement;

import _case_study.model.*;
import _case_study.service.BookingService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;
import java.util.*;
public class BookingServiceImplement implements BookingService {
    static final String CUSTOMER_FILE_PATH = "src\\_case_study\\data\\customer.csv";
    static final String FACILITY_FILE_PATH = "src\\_case_study\\data\\facility.csv";
    static final String BOOKING_QUEUE_FILE_PATH = "src\\_case_study\\data\\bookingQueue.csv";

    Scanner input = new Scanner(System.in);

    private String getCustomerCode() {
        List<Customer> customerList = ReadFile.getListCustomer(CUSTOMER_FILE_PATH);
        int i = 1;
        System.out.println("List customer : ");
        for (Customer customer : customerList) {
            System.out.println(+i + " : " + customer.getCustomerCode());
            System.out.println(customer.toString());
            i++;
        }
        String customerCode = "";
        boolean flag = true;
        boolean check = true;
        while (flag) {
            try {
                System.out.println("Enter the customer code of your choice");
                customerCode = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
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

    private String getIdService() {
        Map<Facility, Integer> facilityIntegerMap = ReadFile.getFacilityMap(FACILITY_FILE_PATH);
        Set<Facility> keySet = facilityIntegerMap.keySet();
        int j = 1;
        System.out.println("List id of service: ");
        for (Facility key : keySet) {
            System.out.println(j + " : " + key.getIdService());
            j++;
        }
        String idService = "";
        boolean flag1 = true;
        boolean check1 = true;
        while (flag1) {
            try {
                System.out.println("Enter the id service of your choice");
                idService = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (Facility key : keySet) {
                if (key.getIdService().equals(idService)) {
                    flag1 = false;
                    check1 = false;
                    break;
                }
            }
            if (check1) {
                System.out.println("You entered wrong ,please enter again !");
            }
        }
        return idService;
    }

    private String getServiceType(String idService) {
        String serviceType = "";
        Map<Facility, Integer> facilityIntegerMap = ReadFile.getFacilityMap(FACILITY_FILE_PATH);
        Set<Facility> keySet = facilityIntegerMap.keySet();
        for (Facility key : keySet) {
            if (key.getIdService().equals(idService)) {
                if (key instanceof Villa) {
                    serviceType = "Villa";
                }
                if (key instanceof House) {
                    serviceType = "House";
                }
                if (key instanceof Room) {
                    serviceType = "Room";
                }
            }
        }
        return serviceType;
    }
    @Override
    public void add(String path) {
        TreeSet<Booking> bookingTreeSet = ReadFile.getBookingSet(path);
        String customerCode = getCustomerCode();
        String idService = getIdService();
        String bookingCode = "";
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter new booking code");
                bookingCode = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            flag = false;
            for (Booking booking : bookingTreeSet) {
                if (booking.getBookingCode().equals(bookingCode)) {
                    System.out.println("Booking code is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        try {
            System.out.println("Enter start date");
            String startDate = input.nextLine();
            System.out.println("Enter end date");
            String endDate = input.nextLine();
            String serviceType = getServiceType(idService);
            System.out.println(serviceType);
            Booking booking = new Booking(bookingCode, startDate, endDate, idService, customerCode, serviceType);
            bookingTreeSet.add(booking);
            System.out.println("Add booking completed !");


            //T??ng s??? l???n s??? d???ng facility khi booking th??nh c??ng .
            FacilityServiceImplement facilityServiceImplement = new FacilityServiceImplement();
            facilityServiceImplement.addemployment(idService, FACILITY_FILE_PATH);


            WriteFile.writeBookingToCSV(path, bookingTreeSet, false);
            display(path);


            //add booking to queue.
            String bookingQueuePath = BOOKING_QUEUE_FILE_PATH;
            Queue<Booking> queueBooking = ReadFile.getBookingQueue(bookingQueuePath);

                if (booking.getServiceType().equals("Villa") || booking.getServiceType().equals("House")) {
                    queueBooking.add(booking);
                }
            WriteFile.writeBookingQueueToCSV(bookingQueuePath, queueBooking, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

