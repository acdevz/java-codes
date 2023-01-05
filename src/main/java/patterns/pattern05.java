package patterns;

public class pattern05 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < 2 * n - 1; i++) {
            int until;
            if (i < n){
                until = i + 1;
            }else{
                until = 2 * n - 1 - i;
            }
            for (int j = 0; j < until; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
