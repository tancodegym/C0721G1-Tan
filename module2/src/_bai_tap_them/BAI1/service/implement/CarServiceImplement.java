package _bai_tap_them.BAI1.service.implement;

import _bai_tap_them.BAI1.model.Car;
import _bai_tap_them.BAI1.model.Motorbike;
import _bai_tap_them.BAI1.model.Producer;
import _bai_tap_them.BAI1.model.Vans;
import _bai_tap_them.BAI1.service.CarService;
import _bai_tap_them.BAI1.util.NotFoundVehicelException;
import _bai_tap_them.BAI1.util.ReadTransportFile;
import _bai_tap_them.BAI1.util.Validate;
import _bai_tap_them.BAI1.util.WriteTransportFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarServiceImplement implements CarService {
    final String CAR_PATH = "src\\_bai_tap_them\\BAI1\\data\\car.csv";
    final String PRODUCER_PATH = "src\\_bai_tap_them\\BAI1\\data\\hangSanXuat.csv";
    final String VANS_PATH = "src\\_bai_tap_them\\BAI1\\data\\vans.csv";
    final String MOTORBIKE_PATH = "src\\_bai_tap_them\\BAI1\\data\\motobike.csv";
    Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        List<Car> carList = ReadTransportFile.getListCar(CAR_PATH);
        String bks = "";
        boolean flag = true;
        while (flag) {
            try {
                do{
                System.out.println("Enter new bks of car");
                bks = input.nextLine();}while(!Validate.validateBKSCar(bks));
            } catch (Exception e) {
                e.printStackTrace();
            }
            flag = false;
            for (Car car : carList) {
                if (car.getBks().equals(bks)) {
                    System.out.println("BKS is exist, please enter again !");
                    flag = true;
                    break;
                }
            }
        }
        try {

            List<Producer> producerList = ReadTransportFile.getListProducer(PRODUCER_PATH);
            List<String> nameProducerList = new ArrayList<>();
            for (Producer producer : producerList) {
                System.out.println(producer.getNameOfProducer());
                nameProducerList.add(producer.getNameOfProducer());
            }
            String nameProducer;
            boolean check = true;
            while (check) {
                System.out.println("Enter Name Of Producer you choose:");
                nameProducer = input.nextLine();
                for (String string : nameProducerList) {
                    if (string.equals(nameProducer)) {
                        check = false;
                        break;
                    }
                }
                int yearProduce = 0;
                do {
                    try {
                        System.out.println("Enter year produce");
                        yearProduce = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                } while (!Validate.validateYearProduce(yearProduce));

                System.out.println("Enter name of Owner");
                String nameOfOwner = input.nextLine();
                System.out.println("Enter type of Car");
                String typeOfCar = chooseTypeOfCar();
                System.out.println("Enter number of sit");
                int numberOfSit = Integer.parseInt(input.nextLine());
                Car car = new Car(bks, nameProducer, yearProduce, nameOfOwner, numberOfSit, typeOfCar);
                carList.add(car);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Add car completed !");
        WriteTransportFile.writeCarTOCSV(CAR_PATH, carList, false);
        display();
    }

    @Override
    public void display() {
        List<Car> carList = ReadTransportFile.getListCar(CAR_PATH);
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    @Override
    public void delete() {
        List<Car> carList = ReadTransportFile.getListCar(CAR_PATH);
        List<Vans> vansList = ReadTransportFile.getListVans(VANS_PATH);
        List<Motorbike> motorbikeList = ReadTransportFile.getListMotorbike(MOTORBIKE_PATH);
        String bks;
        boolean check;
        do {
            System.out.println("Enter bks you want to delete");
            bks = input.nextLine();
            check = false;
            try {
                if (!Validate.validateBKSCar(bks) && !Validate.validateBKSMotorBike(bks) && !Validate.validateBKSVans(bks)) {
                    throw new NotFoundVehicelException("BKS is not exist, please enter again !");
                }
            } catch (NotFoundVehicelException e) {
                System.err.println(e.getString());
                check = true;
            }
        } while (check);
        for (Car car : carList) {
            if (car.getBks().equals(bks)) {
                System.out.println("Are you sure to delete:\n" +
                        "1.Yes \n" +
                        "2.No");
                String choose = input.nextLine();
                switch (choose) {
                    case "1":
                        carList.remove(car);
                        WriteTransportFile.writeCarTOCSV(CAR_PATH, carList, false);
                        System.out.println("Delete complete, press Enter back to mainMenu");
                        break;
                    case "2":
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choose);
                }


            }
        }
        for (Vans vans : vansList) {
            if (vans.getBks().equals(bks)) {
                System.out.println("Are you sure to delete:\n" +
                        "1.Yes \n" +
                        "2.No");
                String choose = input.nextLine();
                switch (choose) {
                    case "1":
                        vansList.remove(vans);
                        WriteTransportFile.writeVansTOCSV(CAR_PATH, vansList, false);
                        System.out.println("Delete complete, press Enter back to mainMenu");
                        break;
                    case "2":
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choose);
                }


            }
        }
        for (Motorbike motorbike : motorbikeList) {
            if (motorbike.getBks().equals(bks)) {
                System.out.println("Are you sure to delete:\n" +
                        "1.Yes \n" +
                        "2.No");
                String choose = input.nextLine();
                switch (choose) {
                    case "1":
                        motorbikeList.remove(motorbike);
                        WriteTransportFile.writeMotorbikeTOCSV(CAR_PATH, motorbikeList, false);
                        System.out.println("Delete complete, press Enter back to mainMenu");
                        break;
                    case "2":
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choose);
                }

            }
        }

    }

    private String chooseTypeOfCar() {
        String typeOfCar;
        System.out.println("Choose type of car :"
                + "1.Xe Khách \n"
                + "2.Du lịch \n"
        );
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                typeOfCar = "Xe Khách ";
                break;
            case "2":
                typeOfCar = "Du lịch";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        return typeOfCar;
    }


}
