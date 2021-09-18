package _bai_tap_them.BAI1.util;

import java.time.LocalDate;
import java.util.Date;

public class Validate {
    public static boolean validateBKSVans(String bks) {
                final String BKS_REGEX = "\\d{2}C-\\d{3}.\\d{2}";
                if (bks.matches(BKS_REGEX)) {
                    return true;
                } else {
                    System.out.println("Please enter again, wrong text format !");
                    return false;
                }
    }

    public static boolean validateBKSCar(String bks) {
        final String BKS_REGEX = "\\d{2}[A-B]-\\d{3}.\\d{2}";
        if (bks.matches(BKS_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong text format !");
            return false;
        }
    }

    public static boolean validateBKSMotorBike(String bks) {
        final String BKS_REGEX = "\\d{2}-[A-Z][A-Z|0-9]-\\d{3}.\\d{2}";
        if (bks.matches(BKS_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong text format !");
            return false;
        }
    }

    public static boolean validateYearProduce(int year) {
        LocalDate date = LocalDate.now();
        if (date.getYear() - year < 50) {
            return true;
        } else {
            System.err.println("Year of product must be less than 50");
            return false;
        }
    }

    public static boolean validateName(String name) {
        final String NAME_REGEX = "^[A-Z]{1}([a-z])*([ ][A-Z]{1}([a-z])*)+";
        if (name.matches(NAME_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong name format !");
            return false;
        }
    }

    public static boolean validateTypeOfCar(String typeOfCar) {
        final String TYPE_OF_CAR_REGEX = "";
        if (typeOfCar.matches(TYPE_OF_CAR_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong name format !");
            return false;
        }
    }


}
