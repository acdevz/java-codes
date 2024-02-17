package Labs.week01;

import java.util.Scanner;

public class P013 {
    private static void getFactors(int num){
        if (num <= 0){
            return;
        }
        for (int i = 1; i*i <= num; i++) {
            if(num % i == 0){
                System.out.print(i + " " + num / i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        getFactors(num);
    }
}
