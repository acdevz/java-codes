package math;

public class Prime {
    public static void main(String[] args) {
//        int n = 10;
//        System.out.println(isPrime(n));

        findPrimes(40);

    }


    //finding primes by multiples: Sieve of Eratosthenes!!!
    static void findPrimes(int n){
        boolean[] primes = new boolean[n-1];
        for (int i = 2; i*i <= n; i++) {
            if( !primes[i-2] ){
                for (int j = i + i; j <= n; j += i) {
                    primes[j-2] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if (!primes[i-2]){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}