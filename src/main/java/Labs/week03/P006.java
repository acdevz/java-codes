package Labs.week03;

import java.util.Arrays;

public class P006 {
    public static void main(String[] args) {
        String text = "qwertyuijhgfdszxcvbnmjhgfdswqwertyuioplkjhgfdertyhnbvcxsawergv";
        String[] tokens = P004.tokenize(text, 'e');
        P003.sort(tokens);
        tokens = P004.removeAdjDuplicates(tokens);
        System.out.println(Arrays.toString(tokens));
    }
}
