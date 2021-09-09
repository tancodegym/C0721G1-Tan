package _19_bai19_StringAndRegex.thuc_hanh.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AccountExample {
     public AccountExample() {
     }
     private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
     public boolean validateAccount( String regex){
         Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
         Matcher matcher = pattern.matcher(regex);
         return  matcher.matches();
     }
 }
