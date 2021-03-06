package _case_study.controller;

import _case_study.service.*;
import _case_study.service.implement.*;

import java.util.Scanner;

public class FuramaController {
     static EmployeeService employeeService = new EmployeeServiceImplement();
     static CustomerService customerService = new CustomerServiceImplement();
     static FacilityService facilityService = new FacilityServiceImplement();
     static BookingService bookingService = new BookingServiceImplement();
     static ContractService contractService = new ContractServiceImplement();
     static PromotionService promotionService = new PromotionServiceImplement();

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\t\tMAIN MENU\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit Menu\n");
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    displayMenuEmployeeManagement(input);
                    break;
                case "2":
                    displayMenuCustomerManagement(input);
                    break;
                case "3":
                    displayMenuFacilityManagement(input);
                    break;
                case "4":
                    displayMenuBookingManagement(input);
                    break;
                case "5":
                    displayMenuPromotionManagement(input);
                    break;
                case "6":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        }
    }
    public static void displayMenuEmployeeManagement(Scanner input) {
        final String path = "src\\_case_study\\data\\employee.csv";
        while (true) {
            System.out.println("Menu Employee Management\n" +
                    "1.\tDisplay list employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\tEdit employee\n" +
                    "4.\tReturn main menu\n" +
                    "0.\tExit Menu\n");
            System.out.println("Enter your choose :");
            String choose1=input.nextLine();
            switch (choose1) {
                case "1":
                    employeeService.display(path);
                    break;
                case "2":
                    employeeService.add(path);
                    break;
                case "3":
                    employeeService.edit(path);
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "0":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose1);
            }
        }
    }

    public static void displayMenuCustomerManagement(Scanner input) {
        final String path = "src\\_case_study\\data\\customer.csv";
        while (true) {
            System.out.println("Menu Customer Management \n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customers\n" +
                    "3.\tEdit customers\n" +
                    "4.\tReturn main menu\n" +
                    "0.\tExit Menu\n"
                    );
            System.out.println("Enter your choose :");
            String choose2 = input.nextLine();
            switch (choose2) {
                case "1":
                    customerService.display(path);
                    break;
                case "2":
                    customerService.add(path);
                    break;
                case "3":
                    customerService.edit(path);
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "0":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose2);
            }
        }
    }

    public static void displayMenuFacilityManagement(Scanner input) {
        final String facilityPath = "src\\_case_study\\data\\facility.csv";
        while (true) {
            System.out.println("Menu Facility Management \n" +
                    "1.\tDisplay list facility\n" +
                    "2.\tAdd new facility\n" +
                    "3.\tDisplay list facility maintenance\n" +
                    "4.\tReturn main menu\n" +
                    "0.\tExit Menu\n");
            System.out.println("Enter your choose :");
            String choose3 = input.nextLine();
            switch (choose3) {
                case "1":
                    facilityService.display(facilityPath);
                    break;
                case "2":
                    facilityService.add(facilityPath);
                    break;
                case "3":
                    facilityService.displayListMaintenance(facilityPath);
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "0":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose3);
            }
        }
    }

    public static void displayMenuBookingManagement(Scanner input) {
        final String BOOKING_PATH = "src\\_case_study\\data\\booking.csv";
        final String CONTRACT_PATH = "src\\_case_study\\data\\contract.csv";
        while (true) {
            System.out.println("Menu Booking  Management \n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n" +
                    "0.\tExit Menu\n");
            System.out.println("Enter your choose :");
            String choose4 = input.nextLine();
            switch (choose4) {
                case "1":
                    bookingService.add(BOOKING_PATH);
                    break;
                case "2":
                    bookingService.display(BOOKING_PATH);
                    break;
                case "3":
                    contractService.add(CONTRACT_PATH);
                    break;
                case "4":
                    contractService.display(CONTRACT_PATH);
                    break;
                case "5":
                    contractService.edit(CONTRACT_PATH);
                    break;
                case "6":
                    displayMainMenu();
                    break;
                case "0":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose4);

            }
        }
    }

    public static void displayMenuPromotionManagement(Scanner input) {
        while (true) {
            System.out.println("Menu Promotion  Management \n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n" +
                    "0.\tExit Menu\n");
            System.out.println("Enter your choose :");
            String choose5 = input.nextLine();
            switch (choose5) {
                case "1":
                    promotionService.showServiceUser();
                    break;
                case "2":
                    promotionService.showUserGetVoucher();
                    break;
                case "3":
                    displayMainMenu();
                    break;
                case "0":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose5);
            }
        }
    }
}