package strings;

public class Stringbuilder {

    public static void main(String[] args) {

        //NOTE*
        // String is thread-safe immutable sequence of characters !!! (String pool)
        // StringBuffer is thread-safe mutable sequence of characters !!! (Heap) (synchronized)

        // StringBuilder is mutable sequence of characters !!! (Heap) (fastest) (not synchronized)
        // StringBuilder is NOT thread safe !!!

        StringBuilder s = new StringBuilder("Hello");

        s.append(" World").append("!"); // returns itself..
//        System.out.println(s.replace(0,1, ""));
//        s.deleteCharAt(s.length() - 1);
//        s.append(45);
//        s.insert(5, "xxx");
//        final char c = s.charAt(s.length() - 1);
        s.delete(1, 2);
        System.out.println(s);

        StringBuilder str = new StringBuilder("leetcode");
        str.insert(4, "code");
        System.out.println(str);
    }
}
