package math;

public class Sqrt {
    public static void main(String[] args) {
        int n = 10;
        double res = sqrt2(n);
        System.out.println(res);
    }
    
    // Finding Square Root of Numbers
    // method1 : Binary Search!

    static double sqrt1(int n, int p){
        int s = 0;
        int e = n;
        int m = 0;
        while (s < e){
            m = s + (e - s)/2;
            if (m*m < n){
                s = m + 1;
            }else if (m*m > n) {
                e = m - 1;
            }else{
                return m;
            }
        }
        double root = m;
        double k = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += k;
            }
            root -= k;
            k /= 10;
        }
        return root;
    }

    //Newton-Raphson method2

    //                X  +  N / X
    //    root(N) =  ------------
    //                    2

    static double sqrt2(int n){
        double x = n;
        double root;
        while (true){
            root = (x + n/x) / 2;
            if (Math.abs(root - x) <  0.01){
                break;
            }
            x = root;
        }
        return root;
    }
}
