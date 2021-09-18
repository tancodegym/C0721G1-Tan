package _bai_tap_them.BAI1.util;

import _bai_tap_them.BAI1.model.Car;
import _bai_tap_them.BAI1.model.Motorbike;
import _bai_tap_them.BAI1.model.Vans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteTransportFile {
    private static void writeToFile(String path, List<String> list, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeCarTOCSV(String path, List<Car> carList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            stringList.add(car.getString());
        }
        writeToFile(path, stringList, append);
    }
    public static void writeVansTOCSV(String path, List<Vans> vansList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Vans vans : vansList) {
            stringList.add(vans.getString());
        }
        writeToFile(path, stringList, append);
    }
    public static void writeMotorbikeTOCSV(String path, List<Motorbike> motorbikes, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Motorbike motorbike : motorbikes) {
            stringList.add(motorbike.getString());
        }
        writeToFile(path, stringList, append);
    }
}
