package Labs.week01;

public class P005 {
    public static void main(String[] args) {
        /*Pattern*/
        int n = 5;
        for(int i = 0; i < 2 * n + 1; i++){
            if(i == 0){
                System.out.print("*  ");
                for (int j = 0; j < n - 1; j++)
                    System.out.print("   ");
                for (int j = 0; j < n + 1; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
            if(i < n && i > 0){
                System.out.print("*  ");
                for (int j = 0; j < n - 1; j++)
                    System.out.print("   ");
                System.out.print("*  ");
                System.out.println();
            }
            if(i == n){
                for (int j = 0; j < 2 * n + 1; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
            if(i < 2 * n && i > n){
                for (int j = 0; j < n; j++)
                    System.out.print("   ");
                System.out.print("*  ");
                for (int j = 0; j < n - 1; j++)
                    System.out.print("   ");
                System.out.print("*  ");
                System.out.println();
            }
            if(i == 2 * n){
                for (int j = 0; j < n + 1; j++) {
                    System.out.print("*  ");
                }
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                System.out.println();
            }
        }
    }
}
