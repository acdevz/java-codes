package math;

public class Division {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor)); // Output: 3

        dividend = 7;
        divisor = -3;
        System.out.println(divide(dividend, divisor)); // Output: -2

        dividend = 0;
        divisor = 1;
        System.out.println(divide(dividend, divisor)); // Output: 0

        dividend = 1;
        divisor = 1;
        System.out.println(divide(dividend, divisor)); // Output: 1
    }

    private static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign = 2;
        if(dividend > 0){
            sign--;
            dividend = -dividend;
        }
        if(divisor > 0){
            sign--;
            divisor = -divisor;
        }
        int quotient = 0;
        while(dividend <= divisor){
            int value = divisor;
            int powerOfTwo = 1;
            while(value + value >= dividend && value + value < 0){
                value += value;
                powerOfTwo += powerOfTwo;
            }
            dividend -= value;
            quotient += powerOfTwo;
        }
        return sign == 1 ? -quotient : quotient;
    }

    private int binaryLongDivision(int dividend, int divisor){
        return dividend / divisor;
    }
}

