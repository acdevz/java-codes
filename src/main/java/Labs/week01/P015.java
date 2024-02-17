package Labs.week01;

import java.util.Scanner;

public class P015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if((num & 1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
