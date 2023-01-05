package patterns;

public class pattern15 {
    public static void main(String[] args) {
        int n = 3;

        int t = 0;
        while (t < 2*n - 1) {
            int i = t;
            if( i > n - 1){
                i = 2*n - 2 - i;
            }
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 0){
                System.out.print("*");
            }
            System.out.println();
            t++;
        }
    }
}
