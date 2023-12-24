package strings;

public class SplitAndJoin {
    public static void main(String[] args) {

        // Split...
        String str = "Hello, World! How are you?";
        String[] words = str.split("[, ?]+");
        for (String word : words) {
            System.out.println(word);
        }

        // Join...
        String joined = String.join(" ", words);
        System.out.println(joined);

    }
}
