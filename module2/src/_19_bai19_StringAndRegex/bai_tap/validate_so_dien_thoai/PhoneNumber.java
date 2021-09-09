package _19_bai19_StringAndRegex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneNumber {
    public PhoneNumber() {
    }

    private static final String PHONENUMBER_REGEX = "^[\\(]+\\d{2,}+[\\)\\-\\(]+\\d{10}+[\\)]$";
    public boolean validatePhoneNumber(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
