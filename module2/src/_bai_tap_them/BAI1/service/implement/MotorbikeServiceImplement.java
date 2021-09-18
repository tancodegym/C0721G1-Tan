package _bai_tap_them.BAI1.service.implement;
import _bai_tap_them.BAI1.model.Motorbike;
import _bai_tap_them.BAI1.model.Producer;
import _bai_tap_them.BAI1.service.MotorbikeService;
import _bai_tap_them.BAI1.util.ReadTransportFile;
import _bai_tap_them.BAI1.util.WriteTransportFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeServiceImplement implements MotorbikeService {
//    final String CAR_PATH = "src\\_bai_tap_them\\BAI1\\data\\car.csv";
    final String PRODUCER_PATH = "src\\_bai_tap_them\\BAI1\\data\\hangSanXuat.csv";
//    final String VANS_PATH = "src\\_bai_tap_them\\BAI1\\data\\vans.csv";
    final String MOTORBIKE_PATH = "src\\_bai_tap_them\\BAI1\\data\\motobike.csv";
    Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        List<Motorbike> motorbikeList = ReadTransportFile.getListMotorbike(MOTORBIKE_PATH);
        String bks = "";
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter new bks of car");
                bks = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            flag = false;
            for (Motorbike motorbike : motorbikeList) {
                if (motorbike.getBks().equals(bks)) {
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
                System.out.println("Enter year produce");
                int yearProduce = Integer.parseInt(input.nextLine());
                System.out.println("Enter name of Owner");
                String nameOfOwner = input.nextLine();
                System.out.println("Enter number of power");
                int numberOfPower = Integer.parseInt(input.nextLine());
                Motorbike motorbike = new Motorbike(bks, nameProducer, yearProduce, nameOfOwner, numberOfPower);
                motorbikeList.add(motorbike);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Add car completed !");
        WriteTransportFile.writeMotorbikeTOCSV(MOTORBIKE_PATH, motorbikeList, false);
        display();
    }


    @Override
    public void display() {
        List<Motorbike> motorbikeList = ReadTransportFile.getListMotorbike(MOTORBIKE_PATH);
        for (Motorbike motorbike : motorbikeList) {
            System.out.println(motorbike.toString());
        }
    }

    @Override
    public void delete() {

    }
}
