package basics;

import java.util.Scanner;

public class ConditionsAndLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 100){
            System.out.println("it's too large but okay!");
        }
        else{
            System.out.println("Okay!");
        }

//        for loop
//        for (int i = 1; i <= n; i++){
//            System.out.println(i);
//        }

//        while loop
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }

//        do while loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 2);
    }
}
