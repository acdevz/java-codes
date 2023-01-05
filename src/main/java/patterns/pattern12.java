package patterns;

public class pattern12 {
    public static void main(String[] args) {
        int n = 3;

        //method1
        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
