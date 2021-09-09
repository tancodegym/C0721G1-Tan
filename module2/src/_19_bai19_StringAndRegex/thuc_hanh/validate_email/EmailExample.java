package _19_bai19_StringAndRegex.thuc_hanh.validate_email;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailExample(){
        pattern= Pattern.compile(EMAIL_REGEX);
    }
    public boolean validateEmail(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

}
