package _case_study.service.implement;

import _case_study.model.Booking;
import _case_study.model.Customer;
import _case_study.service.PromotionService;
import _case_study.utils.ReadFile;
import java.time.LocalDate;
import java.util.*;
public class PromotionServiceImplement implements PromotionService {
    static final String CUSTOMER_FILE_PATH = "src\\_case_study\\data\\customer.csv";
    static final String BOOKING_PATH = "src\\_case_study\\data\\booking.csv";
    Scanner input = new Scanner(System.in);
    @Override
    public void showServiceUser() {
        String year = "";
        try {
            System.out.println("Enter year :");
            year = input.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Set<String> setCustomerCode = new LinkedHashSet<>();
        TreeSet<Booking> bookingTreeSet = ReadFile.getBookingSet(BOOKING_PATH);
        for (Booking booking : bookingTreeSet) {
            String[] array = booking.getStartDate().split("/");
            if (year.equals(array[2])) {
                setCustomerCode.add(booking.getCustomerCode());
            }
        }
        List<Customer> customerList = ReadFile.getListCustomer(CUSTOMER_FILE_PATH);
        List<Customer> userInYear = new ArrayList<>();
        for (String string : setCustomerCode) {
            for (Customer customer : customerList) {
                if (string.equals(customer.getCustomerCode())) {
                    userInYear.add(customer);
                }
            }
        }
        if (userInYear.size() == 0) {
            System.out.println("In " + year + " , furama had 0 customer.");
        } else {
            System.out.println("List customer in " + year + " is : ");
            for (Customer customer : userInYear) {
                System.out.println(customer.toString());
            }
        }
    }
    @Override
    public void showUserGetVoucher() {
        Stack<Booking> bookingStack = new Stack<>();
        Set<Booking> bookingSet = ReadFile.getBookingSet(BOOKING_PATH);
        List<Customer> customerList = ReadFile.getListCustomer(CUSTOMER_FILE_PATH);
        int discount_10 = 0;
        int discount_20 = 0;
        int discount_50 = 0;
        try {
            System.out.println("Enter number of voucher 10%");
            discount_10 = Integer.parseInt(input.nextLine());
            System.out.println("Enter number of voucher 20%");
            discount_20 = Integer.parseInt(input.nextLine());
            System.out.println("Enter number of voucher 50%");
            discount_50 = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int numberOfVoucher = discount_10 + discount_20 + discount_50;
        int sizeOfStack = 0;
        int month = LocalDate.now().getMonthValue();
        int year = LocalDate.now().getYear();
        for (Booking booking : bookingSet) {
            String[] arrayOfDate = booking.getStartDate().split("/");
            boolean checkMonth = Integer.parseInt(arrayOfDate[1]) == month;
            boolean checkYear = year == Integer.parseInt(arrayOfDate[2]);
            if (checkMonth && checkYear) {
                bookingStack.push(booking);
                sizeOfStack++;
            }
            if (sizeOfStack == numberOfVoucher) {
                break;
            }
        }
        System.out.println("List customer get voucher 10% : ");
        for (int i = 0; i < discount_10; i++) {
            displayListCustomer(bookingStack, customerList);
        }
        System.out.println("List customer get voucher 20% : ");
        for (int i = 0; i < discount_20; i++) {
            displayListCustomer(bookingStack, customerList);
        }
        System.out.println("List customer get voucher 50% : ");
        for (int i = 0; i < discount_50; i++) {
            displayListCustomer(bookingStack, customerList);
        }
    }
    public void displayListCustomer(Stack<Booking> stack, List<Customer> list) {
        if (!stack.empty()) {
            for (Customer customer : list) {
                if (stack.peek().getCustomerCode().equals(customer.getCustomerCode())) {
                    System.out.println(customer.toString());
                    stack.pop();
                    break;
                }
            }
        }
    }
}
