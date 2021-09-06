package _19_bai19_StringAndRegex.bai_tap;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ClassExample {
    public ClassExample() {
    }

    private static final String CLASS_REGEX = "^[A-Z]+[0-9]{4,}+[G-M]$";

    public boolean validateClass(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}

class ClassExampleTest {
    private static ClassExample classExample;

    public static void main(String[] args) {
        classExample = new ClassExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name class :");
        String nameClass = input.nextLine();
        boolean isvalid = classExample.validateClass(nameClass);
        if (isvalid) {
            System.out.println("Class name is valid !");
        } else {
            System.out.println("Class name is invalid !");
        }

    }
}