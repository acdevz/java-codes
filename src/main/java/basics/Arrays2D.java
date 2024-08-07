package basics;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr2D = new int[3][];

//        for (int i = 0; i < 3; i++){
//            System.out.print("Row "+ (i + 1)+": ");
//            System.out.print("Columns? ");
//            int c = in.nextInt();
//            System.out.print("items: ");
//            int k = 0;
//            while (k < c){
//                int element = in.nextInt();
//                arr2D[i][k] = element;
//                k += 1;
//            }
//        }

        for (int i = 0; i < arr2D.length; i++){
            System.out.print("Row "+ (i + 1)+": ");
            for (int k = 0; k < 3; k++){
                int element = in.nextInt();
                arr2D[i][k] = element;
            }
        }

        for (int i = 0; i < arr2D.length; i++){
            for (int k = 0; k < arr2D[i].length; k++){
                System.out.print(arr2D[i][k] + "  ");
            }
            System.out.println();
        }
    }
}
