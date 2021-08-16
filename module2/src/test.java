import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. VND=>USD");
            System.out.println("2. USD=>VND");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("VND=>USD");
                    int rate = 23000;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhập vào số VND bạn cần chuyển: ");
                    double vnd = Double.parseDouble(sc.nextLine());
                    System.out.println("Số USD bạn nhận được là : " + vnd/rate);
                    break;
                case 2:
                    System.out.println("USD=>VND");
                    int rate1 = 23000;
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhập vào số USD bạn cần chuyển: ");
                    int usd = sc1.nextInt();
                    System.out.println("Số VNĐ bạn nhận được là : " + usd * rate1);
                    break;
                default:
                    System.out.println("Bạn nhập sai rồi !");
            }
        }
    }
}
