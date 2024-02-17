package recursion;

public class Power {
    private static int power(int x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;

        int p = power(x, n / 2);

        if((n & 1) == 1){
            return p * p * x;
        }
        return p * p;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 32));
    }
}
