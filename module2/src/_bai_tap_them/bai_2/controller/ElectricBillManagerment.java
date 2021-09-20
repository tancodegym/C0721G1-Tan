package _bai_tap_them.bai_2.controller;

import _bai_tap_them.bai_2.service.BillService;
import _bai_tap_them.bai_2.service.CustomerService;
import _bai_tap_them.bai_2.service.implement.BillServiceImplement;
import _bai_tap_them.bai_2.service.implement.CustomerServiceImplement;

import java.util.Scanner;

public class ElectricBillManagerment {
    static BillService billService = new BillServiceImplement();
    static CustomerService customerService = new CustomerServiceImplement();
    static Scanner input = new Scanner(System.in);
    public static void displayMainMenu(){
        while(true){
        System.out.println("Main menu \n"+
                "1.Add customer\n"+
                "2.Display info of customer\n"+
                "3.Find customer\n"+
                "4.Add bill \n"+
                "5.Edit bill\n"+
                "6.Display info of bill\n"+
                "0.Exit main menu");
            System.out.println("Enter your choose :");
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    customerService.add();
                    break;
                case "2":
                    customerService.display();
                    break;
                case "3":
                    customerService.find();
                    break;
                case "4":
                    billService.add();
                    break;
                case "5":
                    billService.edit();
                    break;
                case "6":
                    billService.displaydetailedinfo();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Enter again !");
                    displayMainMenu();
                    break;
            }
        }
    }
}
