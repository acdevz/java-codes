package strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        char[] ch = {'j','a','v','a'};
        String s = new String(ch);
//        or...
//        s = "java";
        System.out.println(s);
//
//        //pretty printing... printf()...
//        /* placeholders:
//            %c - Character
//            %d - Decimal number (base 10)
//            %e - Exponential floating-point number
//            %f - Floating-point number
//            %i - Integer (base 10)
//            %o - Octal number (base 8)
//            %s - String
//            %u - Unsigned decimal (integer) number
//            %x - Hexadecimal number (base 16)
//            %t - Date/time
//            %n - Newline
//         */
//        System.out.printf("My number is %.2f", Math.PI);

//        //Operators...
//        System.out.println('a'+'/');
//        System.out.println("a"+"/");
//        System.out.println('a' + 1); // char + int -> int!
//        System.out.println("a"+5); // 5 -> Integer.toString()
//        System.out.println("a"+'5'); // char + String -> String
//        //for "primitives" or "any object with String" !!!

        //String builders... why? cause every operation on strings creates new object, extra spaces!!
        //modifying in place...

//        StringBuilder series = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char c = (char)('a' + i);
//            series.append(c);
//        }
//        System.out.println(series);

        // String Methods...
        String name = "Aman Chandra";
        System.out.println(name.length());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indent(45));
        System.out.println(name);


        String str = "abgghsba";
        change(str);
        System.out.println(str);


        }

        static boolean isPalindrome(String str){
         // String methods
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        static void change(String str){
            str += " Hi!";
        }
}
