package _case_study.utils;

public class DateFormatException extends Exception {
    String errorMessage;
    public DateFormatException(String message){
        errorMessage=message;
    }
    public String getString() {
        return this.errorMessage;
    }
}
