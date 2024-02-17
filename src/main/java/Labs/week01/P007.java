package Labs.week01;

public class P007 {
    /*GCD using recursion*/
    private static int gcd(int x, int y){
        if(x == 0)
            return y;
        return gcd(y % x, x);
    }

    public static void main(String[] args) {
        int x = 5, y = 12;
        System.out.println("GCD : " + gcd(x, y));
    }
}
