package patterns;

public class pattern13 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            if (i == n - 1){
                for (int j = 0; j < 2*n - 1; j++) {
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for (int j = 0; j < 2*i - 1; j++) {
                    System.out.print(" ");
                }
                if (i != 0 ){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
