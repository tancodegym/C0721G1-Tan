package _case_study.controller;

import _case_study.service.CustomerService;
import _case_study.service.EmployeeService;
import _case_study.service.implement.*;

import java.util.Scanner;

public class FuramaController {
    public static EmployeeService employeeService = new EmployeeServiceImplement();
    public static CustomerService customerService = new CustomerServiceImplement();
    public static FacilityServiceImplement facilityService = new FacilityServiceImplement();
    public static BookingServiceImplement bookingService = new BookingServiceImplement();
    public static PromotionServiceImplement promotionService = new PromotionServiceImplement();

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
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    displayMenuEmployeeManagement(input);
                    break;
                case 2:
                    displayMenuCustomerManagement(input);
                    break;
                case 3:
                    displayMenuFacilityManagement(input);
                    break;
                case 4:
                    displayMenuBookingManagement(input);
                    break;
                case 5:
                    displayMenuPromotionManagement(input);
                    break;
                case 6:
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
            int choose1 = Integer.parseInt(input.nextLine());
            switch (choose1) {
                case 1:
                    employeeService.displayList(path);
                    break;
                case 2:
                    employeeService.addList(path);
                    break;
                case 3:
                    employeeService.editList(path);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 0:
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
                    "0.\tExit Menu\n");
            System.out.println("Enter your choose :");
            int choose2 = Integer.parseInt(input.nextLine());
            switch (choose2) {
                case 1:
                    customerService.displayList(path);
                    break;
                case 2:
                    customerService.addList(path);
                    break;
                case 3:
                    customerService.editList(path);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);

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
            int choose3 = Integer.parseInt(input.nextLine());
            switch (choose3) {
                case 1:
                    break;
                case 2:
                    facilityService.addList(facilityPath);
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public static void displayMenuBookingManagement(Scanner input) {
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
            int choose4 = Integer.parseInt(input.nextLine());
            switch (choose4) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
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
            int choose5 = Integer.parseInt(input.nextLine());
            switch (choose5) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}