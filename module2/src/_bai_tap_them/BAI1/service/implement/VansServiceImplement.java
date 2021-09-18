package _bai_tap_them.BAI1.service.implement;

import _bai_tap_them.BAI1.model.Car;
import _bai_tap_them.BAI1.model.Producer;
import _bai_tap_them.BAI1.model.Vans;
import _bai_tap_them.BAI1.service.VansService;
import _bai_tap_them.BAI1.util.ReadTransportFile;
import _bai_tap_them.BAI1.util.WriteTransportFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VansServiceImplement implements VansService {
    final String CAR_PATH = "src\\_bai_tap_them\\BAI1\\data\\car.csv";
    final String PRODUCER_PATH = "src\\_bai_tap_them\\BAI1\\data\\hangSanXuat.csv";
    final String VANS_PATH = "src\\_bai_tap_them\\BAI1\\data\\vans.csv";
    final String MOTORBIKE_PATH = "src\\_bai_tap_them\\BAI1\\data\\motobike.csv";
    Scanner input  = new Scanner(System.in);

    @Override
    public void add() {
        List<Vans> vansList = ReadTransportFile.getListVans(VANS_PATH);
        String bks = "";
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter new bks of vans");
                bks = input.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            flag = false;
            for (Vans vans: vansList) {
                if (vans.getBks().equals(bks)) {
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
                System.out.println("Enter number of tonnage");
                int tonnage= Integer.parseInt(input.nextLine());
                Vans vans = new Vans(bks, nameProducer, yearProduce, nameOfOwner, tonnage);
                vansList.add(vans);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Add vans completed !");
        WriteTransportFile.writeVansTOCSV(VANS_PATH, vansList, false);
        display();
    }



    @Override
    public void display() {
        List<Vans> vansList = ReadTransportFile.getListVans(VANS_PATH);
        for (Vans vans : vansList) {
            System.out.println(vans.toString());
        }
    }

    @Override
    public void delete() {

    }
}
