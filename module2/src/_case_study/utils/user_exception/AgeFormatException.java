package _case_study.utils.user_exception;

public class AgeFormatException extends Exception {
    String errorMessage;
    public AgeFormatException(String message){
        errorMessage=message;
    }
    public String getString() {
        return this.errorMessage;
    }
}
