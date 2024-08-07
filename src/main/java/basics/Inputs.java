package basics;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws IOException {

//        // using BufferedReader
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter here: ");
//
//        // reading a string
//        String name = reader.readLine();
//        String msg = reader.readLine();
//
//        System.out.println(name + msg);
//        // reading an integer
//        int roll = Integer.parseInt(reader.readLine());
//        // reading a float
//        float var = Float.parseFloat(reader.readLine()); // or Double.parseDouble(reader.readLine());
//
//        // building an array from input
//        String[] arr = reader.readLine().split(" ");

        // building an array of integers from input
        // n
        // 1 2 3 4 5
//        int n = Integer.parseInt(reader.readLine());
//        int[] intArr = new int[n];




//        System.out.println(name);

//
//        // using Scanner
//        System.out.print("Enter here: ");
        Scanner input = new Scanner(System.in);
//        int roll = input.nextInt();
//        String name = input.nextLine();
//        System.out.println(name);
//
//        float var = input.nextFloat();
//        System.out.println(var);
            /* problem with scanner : newline */
        int roll = input.nextInt();
        String name = input.nextLine();
        System.out.println(name);
//        // continuous input
//        int sum = 0;
//        while(input.hasNextInt()){
//            int var = input.nextInt();
//            sum += var;
//        }
//        System.out.println(sum);

//        // using command line arguments
//        System.out.println(args.length);
//        for (String arg : args){
//            System.out.println(arg);
//        }

//        // using console
//        System.out.println("Enter here: ");
//        String name = System.console().readLine();
//        System.out.println(name);

        System.err.print("Error");
    }
}
