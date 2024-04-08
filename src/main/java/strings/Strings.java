package strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        // using String new keyword...
        char[] ch = {'j','a','v','a'};
        String s = new String(ch);
//        or...
//        s = "java";
        System.out.println(s);
//
//        //pretty printing... printf()...
//        System.out.printf("My number is %.2f", Math.PI);

//        //Operators...
//        System.out.println('a'+'/');
//        System.out.println("a"+"/");
//        System.out.println('a' + 1); // char + int -> int!
//        System.out.println("a"+5); // 5 -> Integer.toString()
//        System.out.println("a"+'5'); // char + String -> String
//        //for "primitives" or "any object with String" !!!

        //using String Literal...

        // String Methods...
        String name = "Aman Chandra";
        System.out.println(name.length());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indent(45));
        System.out.println(name);


        String str = "abba";
        change(str);
//        str.concat(" Hi!"); // returns! not changes the value of str...
        System.out.println(str + " is palindrome? " + isPalindrome(str));

        String sg = "java";
        System.out.println(sg.compareToIgnoreCase("jav"));
        System.out.println(sg.equals("java"));
        System.out.println(sg.replace('a', 'A'));
/*
        NOTE*

        String Literal: String Constant Pool
        String new keyword: Heap, but...

        String new keyword -> String Constant Pool?
        String str = new String("java");
        String internedStr = str.intern();
*/

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

    // String is immutable...
    static void change(String str){
        str += " Hi!";
    }
}
