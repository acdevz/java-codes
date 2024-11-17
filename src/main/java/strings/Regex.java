package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        Pattern pattern = Pattern.compile("an(?=a)");
        Matcher matcher = pattern.matcher(str);

        //get the first match
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
//        padding 0s to string to get fixed length
        String s = "123";
        System.out.println(String.format("%05d", Integer.parseInt(s)));

    }
}
