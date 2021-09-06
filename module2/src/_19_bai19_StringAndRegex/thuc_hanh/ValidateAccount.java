package _19_bai19_StringAndRegex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AccountExample{
     public AccountExample() {
     }
     private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
     public boolean validateAccount( String regex){
         Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
         Matcher matcher = pattern.matcher(regex);
         return  matcher.matches();
     }
 }
 class AccountExampleTest{
    private static AccountExample accountExample;
    public  static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public  static final String[] invalidAccount = new String []{ ".@", "12345", "1234_", "abcde" };

     public static void main(String[] args) {
         accountExample = new AccountExample();
         for(String account : validAccount){
             boolean isvalid = accountExample.validateAccount(account);
             System.out.println("Account is : "+account+" is valid : "+isvalid);
         }
         for(String account: invalidAccount){
             boolean invalid = accountExample.validateAccount(account);
             System.out.println("Account is: "+account+" is valid: "+invalid);
         }
     }
 }