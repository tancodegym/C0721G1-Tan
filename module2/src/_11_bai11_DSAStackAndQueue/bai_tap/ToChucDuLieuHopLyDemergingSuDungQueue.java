package _11_bai11_DSAStackAndQueue.bai_tap;


import java.time.LocalDate;
import java.util.*;

public class ToChucDuLieuHopLyDemergingSuDungQueue {
    static ArrayList<Data> dataList = new ArrayList<>();
    static {
        dataList.add(new Data("Nguyen Van A", true, LocalDate.of(2000, 2, 25)));
        dataList.add(new Data("Nguyen Van B", true, LocalDate.of(2005, 4, 5)));
        dataList.add(new Data("Nguyen Thi A", false, LocalDate.of(2010, 3, 10)));
        dataList.add(new Data("Nguyen Thi B", false, LocalDate.of(2002, 5, 20)));

    }
    public static void main(String[] args) {
        Queue<Data> man = new LinkedList<>();
        Queue<Data> women = new LinkedList<>();
        Collections.sort(dataList);

        for (Data data : dataList) {
            if (data.isGender()) {
                man.add(data);
            } else {
                women.add(data);
            }
        }
        ArrayList<Data> newData = new ArrayList<>();
        while (!women.isEmpty()) {
            newData.add(women.poll());
        }
        while (!man.isEmpty()) {
            newData.add(man.poll());
        }
        System.out.println("Before Demerging");
        System.out.println();
        for (Data data : dataList) {
            System.out.println(data.dataToString());
        }

        System.out.println("After Demerging ");
        System.out.println();
        for (Data data : newData) {
            System.out.println(data.dataToString());
        }
    }
    static class Data implements Comparable<Data> {
        private String name;
        private boolean gender;
        private LocalDate dateOfBirth;

        public Data() {

        }

        public Data(String name, boolean gender, LocalDate dateOfBirth) {
            this.name = name;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isGender() {
            return gender;
        }

        public String getGender() {
            if (isGender()) {
                return "Male";
            } else return "Female";
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String dataToString() {
            return "Name: " + getName() + ", Gender:  " + getGender() + ", Date of birth: " + getDateOfBirth();

        }

        @Override
        public int compareTo(Data d) {
            return this.getDateOfBirth().compareTo(d.getDateOfBirth());
        }
    }
}



