package math;

public class Bitwise {
    public static void main(String[] args) {
//        System.out.println(isOdd(24));
//        System.out.println(NoOfDigits(15, 2));

//        int[] arr = {3, 2, 1, 4, 1, 2, 4};
//        System.out.println(findUnique(arr));

//        System.out.println(findBit(3, 7));
//        System.out.println(resetBit(3, 7));
//        System.out.println(rightSetBit(0));
//        System.out.println(countSetBit(16));

//        System.out.println(nthMagicNumber(5));
//        System.out.println(nthPascalSum(3));

//        System.out.println(isPowerOf2(1));
//        System.out.println(power(3, 9));

        System.out.println(rangeXOR(4, 6));
    }
    /*
    AND & Operator
    11001 & 1 -> 1
    */
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    /*
     Bitwise XOR Operator
     a ^ 1 -> compliment a
     a ^ 0 -> a
     a ^ a -> 0
    */
    static int findUnique(int[] arr){
        int x = 0;
        for (int i: arr){
            x ^= i;
        }
        return x;
    }

    /* finding ith bit... */
    static int findBit(int i, int n){
        return 1 << (i - 1) & n;
    }

    /* Reset ith bit... */
    static int resetBit(int i, int n){
        return ~(1 << (i - 1)) & n;
    }

    /* Right-most set bit... */
    static int rightSetBit(int n){
        return (n & -n);
    }

    /* Count set bit... */
    static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            n -= (n & -n);
            count++;
        }
        return count;
    }

    /* nth Magic Number */
    static int nthMagicNumber(int n){
        int num = 0;
        int base = 5;
        while(n > 0){
            num += (n & 1) * base;
            n >>= 1;
            base *= 5;
        }
        return num;
    }

    static int NoOfDigits(int n, int base){
        return (int)(Math.log(n) / Math.log(base)) + 1;
    }

    static int nthPascalSum(int n){
        return 1 << (n - 1);
    }

    static boolean isPowerOf2(int n){
        if(n == 0) return false;
        return (n & (n - 1)) == 0;
    }

    /* Power of base : O(log2(pow)), not O(pow)
    * Which Operation is expensive? (3 * 3 * 3 * 3 * 3) or (9 * 27)
    */
    static int power(int base, int pow){
        int ans = 1;
        while(pow > 0){
            if((pow & 1) == 1) {
                ans *= base;
            }
            base *= base;
            pow >>= 1;
        }
        return ans;
    }

    /* finding xor in range(a, b) */
    static int rangeXOR(int x, int y){
        return xor(y)^xor(x - 1);
    }
    /* finding xor in range(1, x)*/
    static int xor(int x){
        return switch (x % 4) {
            case 1 -> 1;
            case 2 -> x + 1;
            case 3 -> 0;
            default -> x;
        };
    }
}