package _exam_module2.util.exception;

public class WrongFormat extends Exception {
    String errorMessage;

    public WrongFormat(String message) {
        errorMessage = message;
    }

    public String getString() {
        return this.errorMessage;
    }
}


