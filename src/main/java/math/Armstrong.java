package math;

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            if (isArmstong(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(isArmstong(153));
    }

    static boolean isArmstong(int num){
        int sum = 0;
        int n = num;
        while (n > 0){
            int digit = n % 10;
            n /= 10;
            sum += digit*digit*digit;
        }
        if (sum == num){
            return true;
        }else{
            return false;
        }
    }
}
