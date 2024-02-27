package Labs.week01;

import java.util.Scanner;

public class P007 {
    /*GCD using recursion*/
    private static int gcd(int x, int y){
        if(x == 0)
            return y;
        return gcd(y % x, x);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        System.out.println("Enter numbers...");
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("GCD : " + gcd(x, y));
    }
}
