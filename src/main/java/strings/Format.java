package strings;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Format {
    public static void main(String[] args) {
        String formatted = String.format("%s", 123);
        System.out.printf("%s%n", 123);
/*
        Format Specifiers
        %b, %B	"true" or "false" based on the argument
        %s, %S	a string
        %c, %C	a Unicode character
        %d	    a decimal integer (used for integers only)
        %o	    an octal integer (used for integers only)
        %x, %X	a hexadecimal integer (used for integers only)
        %e, %E	for scientific notation (used for floating-point numbers)
        %f	    for decimal numbers (used for floating-point numbers)
*/
        System.out.println(formatted);
        System.out.format("%s%n", 123);

        DecimalFormat ft = new DecimalFormat("####.###");
        System.out.println(ft.format(123.456789));

        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dt.format(System.currentTimeMillis()));
    }
}
