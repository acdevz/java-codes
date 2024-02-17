package Labs.week03;

import java.util.Arrays;
import java.util.Scanner;

public class P003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String[] arr = new String[len];
        int k = 0;
        while(k < len){
            String input = in.next();
            if(input.isEmpty())
                break;
            arr[k++] = input;
        }

        System.out.println("Sorting...");
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(String[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean isSorted = true;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].compareToIgnoreCase(arr[j + 1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
    }
}
