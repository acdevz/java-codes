package stringMatching;

public class BruteForce {
    public static void main(String[] args) {
        String text = "Hello World";
        String pattern = "World";
        System.out.println(bruteForce(text, pattern));
    }

    static int bruteForce(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)){
                j++;
            }
            if (j == m){
                return i;
            }
        }
        return -1;
    }
}
