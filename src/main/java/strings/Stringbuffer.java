package strings;

public class Stringbuffer {
    public static void main(String[] args) {

//            StringBuffer s = new StringBuffer("Hello");
            StringBuffer s = new StringBuffer(6);
            s.append("Hello");

            s.append(" World").append("!"); // returns itself...
            System.out.println(s);
    }
}
