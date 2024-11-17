package strings;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class TokenizerAndJoiner {
    public static void main(String[] args) {

        // StringTokenizer...
        StringTokenizer st1 = new StringTokenizer("Hello Java, How are you", ", ");

        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());


        // StringJoiner...
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("Aman");
        sj.add("is");
        sj.add("a");
        sj.add("legend");

        System.out.println(sj);
    }
}
