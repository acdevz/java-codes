package basics;

import java.util.*;

public class Array {
    public static void main(String[] args) {
//        Syntax:
//        datatype[] var_name = new datatype[size]
//        ...


//        int[] rolls = new int[5];
//        System.out.println(rolls[0]);
//        //initialised with 0


//        String[] names = new String[2];
//        System.out.println(names[0]);
//        //initialised with null

        Scanner in = new Scanner(System.in);
//
        int[] arr = new int[5];
         for (int i = 0; i < arr.length; i++){
             arr[i] = in.nextInt();
         }

//         for (int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }

        //enhanced for loop!

        for (int i: arr){
            System.out.print(i + " ");
        }

//        get max/ min
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

//        or
        int min2 = Arrays.stream(arr).min().orElse(0);

    }

}
