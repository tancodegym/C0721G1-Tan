package _exam_module2.util;


public class Validate {
    public static boolean validateDate(String date) {
        final String DATE_REGEX = "([0][1-9]|[1,2][0-9]|[3][0,1])[/]([0][1-9]|[1][0-2])[/](\\d){4}";
        if (date.matches(DATE_REGEX)) {
            return true;
        } else {
            System.err.println("Please enter again, wrong Date of birth format !");
            return false;
        }
    }

    public static boolean validateName(String name) {
        final String NAME_REGEX = "^[A-Z][a-z]*([ ][A-Z]([a-z])*)*";

        if (name.matches(NAME_REGEX)) {
            return true;
        } else {
            System.err.println("Please enter again, wrong name format !");
            return false;
        }
    }
    public static boolean validateGender(String gender) {
        final String GENDER_REGEX = "Male|Female";
        if (gender.matches(GENDER_REGEX)) {
            return true;
        } else {
            System.err.println("Please enter gender again, gender is 'Male' or 'Female' !");
            return false;
        }
    }

    public static boolean validateNumberPhone(String numberPhone) {
        final String NUMBER_PHONE_REGEX = "^(090|091)(\\d){7}";
        if (numberPhone.matches(NUMBER_PHONE_REGEX)) {
            return true;
        } else {
            System.err.println("Please enter again, number of phone is 10-digit string (start is 091 or 090) ! ");
            return false;
        }
    }
    public static boolean validateClassCode(String classCode) {
        final String CLASS_CODE_REGEX = "[1-6]";
        if (classCode.matches(CLASS_CODE_REGEX)) {
            return true;
        } else {
            System.err.println("Please enter again, class code wrong format  ");
            return false;
        }
    }
}
