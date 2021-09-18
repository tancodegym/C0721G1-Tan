package _bai_tap_them.BAI1.util;

public class NotFoundVehicelException extends Exception {
    String errorMessage;

    public NotFoundVehicelException(String message) {
        errorMessage = message;
    }

    public String getString() {
        return this.errorMessage;
    }
}
