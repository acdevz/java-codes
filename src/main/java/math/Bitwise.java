package math;

public class Bitwise {
    public static void main(String[] args) {
//        System.out.println(isOdd(24));

        int[] arr = {3, 2, 1, 4};
        System.out.println(findUnique(arr));
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

    //finding ith bit...
}