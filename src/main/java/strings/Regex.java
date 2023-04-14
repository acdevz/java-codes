package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z]]");
        Matcher matcher = pattern.matcher(str);
    }
}
