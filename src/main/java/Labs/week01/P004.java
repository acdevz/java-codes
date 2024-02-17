package Labs.week01;

import java.util.Scanner;

public class P004 {
    private static int nthFibonacci(int n){
//        if(n == 1 || n == 0)
//            return n;
//        return nthFibonacci(n-1) + nthFibonacci(n -2);

        /*method-2*/
        int f = 0;
        int c = 1;
        int l;
        for (int i = 0; i < n; i++) {
            l = f + c;
            f = c;
            c = l;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("What's n ?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(nthFibonacci(i) + " ");
        }
    }
}
