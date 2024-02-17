package Labs.week01;

import java.util.Scanner;

public class P009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int l = in.nextInt();
        System.out.println("Prime # b/w " + f + " and " + l);
        for (int i = f; i <= l; i++) {
            if(P003.isPrime(i))
                System.out.println(i);
        }
    }
}
