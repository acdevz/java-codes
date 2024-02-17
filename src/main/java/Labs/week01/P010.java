package Labs.week01;

import java.util.Scanner;

public class P010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if(x < 2)
            System.out.println("Cannot be expressed.");

        for(int i = 2; i < x; i++){
            if(P003.isPrime(i)){
                for (int j = x - 2; j > i; j--) {
                    if (P003.isPrime(j) && i + j == x) {
                        System.out.println("Expressed as : " + i + " + " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("Cannot be expressed.");
    }
}
