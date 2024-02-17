package Labs.week01;

import java.util.Scanner;

public class P011 {
    private void getPrimesInterval(int f, int l){
        System.out.println("Prime # b/w " + f + " and " + l);
        for (int i = f; i <= l; i++) {
            if(P003.isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int l = in.nextInt();
        P011 p = new P011();
        p.getPrimesInterval(f, l);
    }
}
