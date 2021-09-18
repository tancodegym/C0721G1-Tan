package _bai_tap_them.BAI1.util.exceptionUser;

public class DateFormat1Exception extends Exception {
    String errorMessage;

    public DateFormat1Exception(String message) {
        errorMessage = message;
    }

    public String getString() {
        return this.errorMessage;
    }
}
