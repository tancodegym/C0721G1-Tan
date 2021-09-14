package _case_study.service.implement;

import _case_study.model.Booking;
import _case_study.model.Contract;
import _case_study.service.ContractService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;

import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class ContractServiceImplement implements ContractService {
    Scanner input = new Scanner(System.in);
    final String BOOKING_QUEUE_PATH = "src\\_case_study\\data\\bookingQueue.csv";

    @Override
    public void add(String path) {
        Queue<Booking> queueBooking = ReadFile.getBookingQueue(BOOKING_QUEUE_PATH);
        Set<Contract> contractSet = ReadFile.getContractSet(path);
        assert queueBooking.peek() != null;
        String bookingCode = queueBooking.peek().getBookingCode();
        assert queueBooking.peek() != null;
        String customerCode = queueBooking.peek().getCustomerCode();
        queueBooking.remove();
        WriteFile.writeBookingQueueToCSV(BOOKING_QUEUE_PATH, queueBooking, false);
        int contractNumber = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter number of contract");
            contractNumber = Integer.parseInt(input.nextLine());
            flag = false;
            for (Contract contract : contractSet) {
                if (contract.getContractNumber() == contractNumber) {
                    System.out.println("Contract number is exist, please enter again !");
                    flag = true;
                    break;
                }
            }

        }
        System.out.println("Enter number of deposit");
        int deposit = Integer.parseInt(input.nextLine());
        System.out.println("Enter number of payment");
        int payment = Integer.parseInt(input.nextLine());
        Contract contract = new Contract(contractNumber, bookingCode, deposit, payment, customerCode);
        contractSet.add(contract);
        WriteFile.writeContractToCSV(path, contractSet, false);
    }

    @Override
    public void display(String path) {
        Set<Contract> contractSet = ReadFile.getContractSet(path);
        for (Contract contract : contractSet) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void edit(String path) {
        Set<Contract> contractSet = ReadFile.getContractSet(path);
        display(path);
        int contractNumber = 0;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter number of contract you want to edit:");
            contractNumber = Integer.parseInt(input.nextLine());
            flag = false;
            for (Contract contract : contractSet) {
                if (contract.getContractNumber() == contractNumber) {
                    System.out.println("---Menu Edit Contract---\n"
                            + "1. Edit number of Contract \n"
                            + "2. Edit booking code of Contract \n"
                            + "3. Edit deposit of Contract \n"
                            + "4. Edit payments  of Contract \n"
                            + "5. Edit customer code of booking \n"
                            + "0. Exit menu edit\n"
                            + "Enter your choose: ");
                    String choose = input.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("Enter number of Contract");
                            int numberOfContract = Integer.parseInt(input.nextLine());
                            contract.setContractNumber(numberOfContract);
                            break;
                        case "2":
                            System.out.println("Enter booking codeof Contract");
                            String bookingCode = input.nextLine();
                            contract.setBookingCode(bookingCode);
                            break;
                        case "3":
                            System.out.println("Enter deposit of Contract");
                            int deposit = Integer.parseInt(input.nextLine());
                            contract.setDeposits(deposit);
                            break;
                        case "4":
                            System.out.println("Enter payments of Contract");
                            int payments = Integer.parseInt(input.nextLine());
                            contract.setPayments(payments);
                            break;
                        case "5":
                            System.out.println("Enter customer code Contract");
                            String customerCode = input.nextLine();
                            contract.setCustomerCode(customerCode);
                            break;
                        case "0":
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + choose);
                    }
                    check = false;
                    break;
                }
                if(check){
                    System.out.println("Number contract does not exist, please re-enter another number !");
                    flag = true;
                }
            }

        }
        WriteFile.writeContractToCSV(path, contractSet, false);
        display(path);
    }
}
