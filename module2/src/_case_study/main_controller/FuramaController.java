package _case_study.main_controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean flag=true;
        boolean check = true;
        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("\t\tMAIN MENU\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "0.\tExit Menu\n");
            System.out.println("Enter your choose :");
            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    while (check){
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
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                check = false;
                                break;
                            case 0:
                                System.exit(0);

                        }
                    }

                case 2:
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
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 0:
                            System.exit(0);

                    }
                    break;
                case 3:
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
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 0:
                            System.exit(0);

                    }
                    break;

                case 4:
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
                            break;
                        case 0:
                            System.exit(0);

                    }
                    break;
                case 5:
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
                            break;

                        case 0:
                            System.exit(0);

                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.exit(-1);
            }
        }


    }
}
