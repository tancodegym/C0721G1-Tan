package _bai_tap_them.bai_2.util;

public class VldElectric {
    public static boolean vldCodeCustomer(String code){
        final String REGEX_CODE_CUSTOMER = "((KHNN-){1}|(KHVN-{1}))(\\d){5}";
        if(code.matches(REGEX_CODE_CUSTOMER)){
            return true;
        }
        else{
            System.err.println("Wrong format code(KHNN-XXXXX), please enter again: ");
            return false;
        }
    }
    public static boolean vldCodeBill(String codeBill){
        final String BILL_CODE_REGEX = "MHD-(\\d){3}";
        if(codeBill.matches(BILL_CODE_REGEX)){
            return true;
        }
        else{
            System.err.println("Wrong format code(MHD-XXX), please enter again: ");
            return false;
        }
    }
    public static boolean vldDate(String date){
        final String DATE_REGEX ="(([1-2]{1}+[\\d]{1})|(0+[1-9]{1})|(3+[0-1]))+(\\/)+((0+[1-9]{1})|(1+[0-2]{1}))+(\\/)+[\\d]{4}";
        if(date.matches(DATE_REGEX)){
            return true;
        }
        else{
            System.err.println("Wrong format date (dd/mm/yyyy)!");
            return false;
        }
    }
    public static boolean vldNumber(int number){
        if(number>0){
            return true;
        }
        else{
            System.err.println("Please enter again,number of input must be greater than 0");
            return false;
        }
    }

}
