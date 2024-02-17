package Labs.week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P008 {
    public static void main(String[] args) {
        System.out.println("What's n ?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Elems ?");
        int[] arr = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        /*Linear Search*/
        System.out.println("Target ? ");
        int target = in.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found.");
    }
}
