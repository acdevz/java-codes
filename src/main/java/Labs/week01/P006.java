package Labs.week01;

import java.util.Scanner;

public class P006 {
    private static boolean isPalindrome(int x){
        int n = x;
        int r = 0;
        int i = 1;
        while(n > 0){
            int d = n % 10;
            r = r * i + d;
            n = n / 10;
            i = 10;
        }
        return x == r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number...");
        int x = in.nextInt();
        if(isPalindrome(x))
            System.out.println("Palindrome Number.");
        else
            System.out.println("Not a palindrome.");
    }
}
