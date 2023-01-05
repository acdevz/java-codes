package testing;

public class Prime {
    public static void main(String[] args) {
        int a = 1967;
        System.out.println(isPrime(a));
    }
    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }else{
            int k = 2;
            while (k*k < num){
                if (num % k == 0){
                    return false;
                }
                k++;
            }
            return true;
        }
    }
}
