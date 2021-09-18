package _bai_tap_them.BAI1.util;

import _bai_tap_them.BAI1.model.Car;
import _bai_tap_them.BAI1.model.Motorbike;
import _bai_tap_them.BAI1.model.Producer;
import _bai_tap_them.BAI1.model.Vans;
import _case_study.model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTransportFile {
    private static List<String> readFromCSV(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Car> getListCar(String path) {

        List<String> listString = readFromCSV(path);
        List<Car> carList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            Car car = new Car(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
            carList.add(car);
        }
        return carList;
    }
    public static List<Vans> getListVans(String path) {

        List<String> listString = readFromCSV(path);
        List<Vans> vansList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            Vans vans = new Vans(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            vansList.add(vans);
        }
        return vansList;
    }
    public static List<Motorbike> getListMotorbike(String path) {

        List<String> listString = readFromCSV(path);
        List<Motorbike> motorbikeList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            Motorbike vans = new Motorbike(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            motorbikeList.add(vans);
        }
        return motorbikeList;
    }
    public static List<Producer> getListProducer(String path) {
        List<String> listString = readFromCSV(path);
        List<Producer> producerList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            Producer producer = new Producer(array[0],array[1],array[2]);
            producerList.add(producer);
        }
        return producerList;
    }

}
