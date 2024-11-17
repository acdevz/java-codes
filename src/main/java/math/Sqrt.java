package math;

public class Sqrt {
    public static void main(String[] args) {
        int n = 37;
//        System.out.println(sqrt2(n));
        System.out.println(sqrt1(146, 5));
    }
    
     /*Finding Square Root of Numbers
     method1 : Binary Search!*/

    static double sqrt1(int n, int p){
        int s = 0;
        int e = n;
        int ans = 0;
        while (s <= e){
            int m = s + (e - s) / 2;
            if (m*m <= n){
                s = m + 1;
                ans = m;
            }else{
                e = m - 1;
            }
        }
        double root = ans; // also check root * root < m : must!
        double k = 0.1;
        for (int i = 0; i < p; i++) {
            while ((root + k) * (root + k) <= n) {
                root += k;
            }
            k /= 10;
        }
        return root;
    }

    /*
    method2: Newton-Raphson method2

                X  +  N / X
    root(N) =  ------------
                    2
     */

    static double sqrt2(int n){
        double x = n;
        double root;
        while (true) {
            root = (x + n / x) / 2;
            if (Math.abs(root - x) < 0.01) {
                return root;
            }
            x = root;
        }
    }
}
