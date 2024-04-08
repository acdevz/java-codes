package strings;

public class Stringbuffer {
    public static void main(String[] args) {

//            StringBuffer s = new StringBuffer("Hello");
            StringBuffer s = new StringBuffer("hiii");
        System.out.println(s.capacity());
            s.append("Hello");

            s.append(" World").append("!").append(" World").append("!").append(" World").append("!"); // returns itself...
            System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
    }
}
