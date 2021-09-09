package _19_bai19_StringAndRegex.thuc_hanh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlDanhSachBaiHat {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String content;
            while ((content = br.readLine()) != null) {
                contentBuilder.append(content);
            }
            content = contentBuilder.toString();
            br.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
