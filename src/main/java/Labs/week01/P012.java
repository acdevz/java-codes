package Labs.week01;

import java.util.Scanner;

public class P012 {
    private static boolean isArmstong(int num) {
        int digits = (int) (Math.log10(num) + 1);
        int sum = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            int product = 1;
            for(int i = 0; i < digits; i++){
                product *= digit;
            }
            sum += product;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(isArmstong(num))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
