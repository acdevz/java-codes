package Labs.week01;

import java.util.Scanner;

public class P003 {
    static boolean isPrime(int x){
        if(x < 2) return false;

        for(int i = 2; i*i <= x; i++){
            if(x % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check prime?");
        int x = in.nextInt();

        if (isPrime(x)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
