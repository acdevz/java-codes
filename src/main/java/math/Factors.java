package math;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
//        factor(36);
        System.out.println(gcd(8, 2));
        System.out.println(lcm(6, 2));
    }

    /* Time & Space Complexity: O( sqrt(n) ) */
    static void factor(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if (n / i == i) continue;
                factors.add(n / i);
            }
        }
        for (int i = factors.size() - 1; i >= 0; i--) {
            System.out.print(factors.get(i) + " ");
        }
    }

    /* GCD : Basic Euclidean algorithm */
    static int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b % a, a);
    }

    /* GCD : Extended Euclidean algorithm */

    /* LCM */
    static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
