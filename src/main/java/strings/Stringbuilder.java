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
        System.out.println(s.replace(0,1, ""));
        s.deleteCharAt(s.length() - 1);
        s.append(45);
        System.out.println(s.toString());
    }
}
