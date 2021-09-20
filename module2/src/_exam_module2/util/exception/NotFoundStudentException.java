package _exam_module2.util.exception;

public class NotFoundStudentException extends Exception {
    String errorMessage;

    public NotFoundStudentException(String message) {
        errorMessage = message;
    }

    public String getString() {
        return this.errorMessage;
    }
}

