package recursion;

public class Recursion {
    public static void main(String[] args) {
//        int res = fibo(6);
//        System.out.println(res);

//        int[] arr = {1,6,3,8,3,5,2};
//        int res = search(arr, 8, 0, arr.length-1);
//        System.out.println(res);
        for (int i = 0; i <= 20; i++) {
            System.out.print(fiboformula(i) + ", ");
        }

    }
    //Binary Search...
    static int search(int[] arr, int target, int s, int e){
        int m = s + (e - s)/2;
        if (target > arr[m]){
            search(arr, target, m + 1, e);
        } else if (target < arr[m]) {
            search(arr, target, s, m - 1);
        }else{
            return m;
        }
        return -1;
    }

    //inefficient fibonacci numbers...
    static int fibo(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    //fibonacci formula
    static int fiboformula(int n){
        int nth =(int)(1/Math.sqrt(5)*(Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n)));
        return nth;
    }
}
