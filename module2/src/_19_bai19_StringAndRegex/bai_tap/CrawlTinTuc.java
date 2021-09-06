package _19_bai19_StringAndRegex.bai_tap;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CrawlSongExample{
    public static void main(String[] args) {
        try {
            URL url = new URL("http://dantri.com.vn/the-gioi.htm");
            Scanner input = new Scanner(new InputStreamReader(url.openStream()));
            input.useDelimiter("\\Z");
            String content = input.next();
            input.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("new:\">(.*)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}