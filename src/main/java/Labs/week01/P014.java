package Labs.week01;

import java.util.Scanner;

public class P014 {
    private static int countDigits(int n){
        return (int)Math.log10(n) + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("Digit Count: " + countDigits(num));
    }
}
