package Labs.week01;

import java.util.Scanner;

public class P002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x, y;
        System.out.println("Enter numbers...");
        x = in.nextFloat();
        y = in.nextFloat();

        System.out.println("Addition : " + (x + y));
        System.out.println("Subtraction : " + (x - y));
        System.out.println("Multiplication : " + (x * y));
        System.out.println("Division : " + (x / y));
    }
}
