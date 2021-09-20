package _case_study.utils.user_exception;

public class SalaryFormatException extends Exception {
    String errorMessage;

    public SalaryFormatException(String message) {
        errorMessage = message;
    }

    public String getString() {
        return this.errorMessage;
    }
}

