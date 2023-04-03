package patterns;

import java.util.Scanner;

public class testpattern {
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        displayPattern(n);

    }
    static void displayPattern(int n){
        for(int i = 0; i < n; i++){
            for(int space = 0; space < n - i - 1; space++){
                System.out.print(String.format("%3s"," "));
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(String.format("%3s", j));
            }
            System.out.println("");
        }
    }
}
