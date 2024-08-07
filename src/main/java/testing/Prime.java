package testing;

public class Prime {
    public static void main(String[] args) {
        int a = 1967;
//        System.out.println(isPrime(a));
//        System.out.println("2" + 2);
        int[] arr = new int[2];
        int i = 0;
        arr[i++] = i;
        System.out.println(arr[0] + " " + arr[1]);
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
