package basics;

import java.util.Scanner;

public class Methods {
    public static void main( String[] args) {

//        accessModifier returnType name{
//            ...
//            return statement
//        }

        greet();

//        Woo! enhanced for loop

        for (String arg : args) {
            System.out.println(arg);
        }

        Scanner in = new Scanner(System.in);
//        int a, b;
//        System.out.print("Number1: ");
//        a = in.nextInt();
//        System.out.print("Number2: ");
//        b = in.nextInt();

//        System.out.println("Sum = " + sum(5, 8));
    }

//    Functions

        static void greet(){
            System.out.println("Namaste! 🙏");
        }

        static int sum(int num1, int num2){
            return num1 + num2;
        }
}
