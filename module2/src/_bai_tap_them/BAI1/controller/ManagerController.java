package _bai_tap_them.BAI1.controller;

import _bai_tap_them.BAI1.service.CarService;
import _bai_tap_them.BAI1.service.MotorbikeService;
import _bai_tap_them.BAI1.service.VansService;
import _bai_tap_them.BAI1.service.implement.CarServiceImplement;
import _bai_tap_them.BAI1.service.implement.MotorbikeServiceImplement;
import _bai_tap_them.BAI1.service.implement.VansServiceImplement;

import java.util.Scanner;

public class ManagerController {
   static CarService carService = new CarServiceImplement();
    static VansService vansService = new VansServiceImplement();
    static MotorbikeService motorbikeService = new MotorbikeServiceImplement();
    static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.println("\t\t MENU TRANSPORT MANAGERMENT\n" +
                    "1.\tAdd transport\n" +
                    "2.\tDisplay transport\n" +
                    "3.\tDelete transport \n" +
                    "4.\tExit Menu\n");
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    displayMenuAdd();
                    break;
                case "2":
                    displayMenuShow();
                    break;
                case "3":
                    carService.delete();
                    break;
                case "4":
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        }

    }
    public static void displayMenuShow(){
        while (true) {
            System.out.println("\t\t MENU SHOW TRANSPORT\n" +
                    "1.\tShow Car\n" +
                    "2.\tShow Vans\n" +
                    "3.\tShow Motorbike \n" +
                    "4.\tExit Menu\n"+
                    "0.\t Return Main Menu");
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    carService.display();
                    break;
                case "2":
                    vansService.display();
                    break;
                case "3":
                    motorbikeService.display();
                    break;
                case "4":
                    System.exit(0);
                    break;
                case "0":
                    displayMainMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        }}

    public static void displayMenuAdd(){
        while (true) {
            System.out.println("\t\t MENU ADD TRANSPORT\n" +
                    "1.\tAdd Car\n" +
                    "2.\tAdd Vans\n" +
                    "3.\tAdd Motorbike \n" +
                    "4.\tExit Menu\n"+
                    "0.\t Return Main Menu");
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    carService.add();
                    break;
                case "2":
                    vansService.add();
                    break;
                case "3":
                    motorbikeService.add();
                    break;
                case "4":
                    System.exit(0);
                    break;
                case "0":
                    displayMainMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
    }

}}