package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int res = fibo(6);
//        System.out.println(res);

        for (int i = 0; i <= 20; i++) {
            System.out.print(fiboformula(i) + ", ");
        }
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
