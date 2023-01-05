package patterns;

public class pattern09 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
