package _case_study.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Validate {
    public static boolean validateNameService(String nameService) {
        final String SERVICE_NAME_REGEX = "^[A-Z][A-z]*";

        if (nameService.matches(SERVICE_NAME_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong text format !");
            return false;
        }

    }

    public static boolean validateCodeService(String codeOfService) {
        final String CODE_SERVICE_REGEX = "^[SV]+(VL|HO|RO)+[-]+\\d{4}";

        if (codeOfService.matches(CODE_SERVICE_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong text format !");
            return false;

        }
    }

    public static boolean validateArea(double area) {
        if (area > 30) {
            return true;
        } else {
            System.out.println("Please enter area again, area must be greater than 30");
            return false;
        }
    }

    public static boolean validatePoolArea(double poolArea) {
        if (poolArea > 30) {
            return true;
        } else {
            System.out.println("Please enter area again, area of pool must be greater than 30");
            return false;
        }
    }

    public static boolean validateCost(int cost) {
        if (cost > 0) {
            return true;
        } else {
            System.out.println("Please enter cost again, Cost must be more than zero !");
            return false;
        }
    }

    public static boolean validateNumberOfPeople(int numberOfPeople) {
        if (numberOfPeople > 0 && numberOfPeople < 20) {
            return true;
        } else {
            System.out.println("Please enter  again, Number of people must be greater than 0 and less than 20 !");
            return false;
        }
    }

    public static boolean validateNumberOfFloor(int numberOfFloor) {
        if (numberOfFloor > 0) {
            return true;
        } else {
            System.out.println("Please enter again, number of floor must be greater than 0 !");
            return false;
        }
    }

    public static boolean validateRentalType(String rentalType) {
        final String RENTAL_TYPE_REGEX = "^[A-Z][A-z]*";

        if (rentalType.matches(RENTAL_TYPE_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong text format !");
            return false;
        }

    }

    public static boolean validateRoomStandard(String roomStandard) {
        final String RENTAL_TYPE_REGEX = "^[A-Z][A-z]*";

        if (roomStandard.matches(RENTAL_TYPE_REGEX)) {
            return true;
        } else {
            System.out.println("Please enter again, wrong text format !");
            return false;
        }
    }
    public static boolean validateDateOfBirth(String dateOfBirth){
        final String DATE_OF_BIRTH_REGEX = "(([1-2]{1}+[\\d]{1})|(0+[1-9]{1})|(3+[0-1]))+(\\/)+((0+[1-9]{1})|(1+[0-2]{1}))+(\\/)+[\\d]{4}";
        try {
            if (!dateOfBirth.matches(DATE_OF_BIRTH_REGEX)) {
                throw new DateFormatException("Wrong format, please enter again.");
            }
        } catch (DateFormatException e) {
            e.getString();
            return false;
        }

        String[] arrayDate = dateOfBirth.split("/");
        int day = Integer.parseInt(arrayDate[0]);
        int month = Integer.parseInt(arrayDate[1]);
        int year = Integer.parseInt(arrayDate[2]);
        DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        Date date1;
        Date date2;
        long getDaysDiff = 0;
        try {
            String startDate = "" + day + "-" + month + "-" + year;
            String endDate = simpleDateFormat.format(currentDate);
            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);
            long getDiff = date2.getTime() - date1.getTime();

            getDaysDiff = getDiff / (24 * 60 * 60 * 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean checkDateMin = getDaysDiff / 365 > 18;
        boolean checkDateMax = getDaysDiff / 365 < 100;
        try{
        if (!checkDateMax) {
            throw new AgeFormatException("Age must be less than 100 !");
        }} catch (AgeFormatException e) {
            e.getString();
            return false;
        }
        try{
        if (!checkDateMin) {
            throw new AgeFormatException("Age must be greater than 18 !");
        }} catch (AgeFormatException e) {
            e.getString();
            return false;
        }
        return true;
    }
}





