package patterns;

public class pattern04 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
