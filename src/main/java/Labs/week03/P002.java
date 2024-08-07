package Labs.week03;

import java.util.Arrays;
import java.util.Scanner;

public class P002 {

    final private int[][] jaggedArray = new int[100][];
    private int[][] merged;
    private int rows;
    private int maxCols = 0;

    public void getJaggedArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Jagged Array.java : rows?");
        rows = in.nextInt();
        for(int i = 0; i < rows; i++){
            int cols = in.nextInt();
            maxCols = Math.max(maxCols, cols);
            int[] col = new int[cols];
            jaggedArray[i] = col;
            for(int j = 0; j < cols; j++){
                jaggedArray[i][j] = in.nextInt();
            }
        }
    }

    public void mergeArray(){
        int[][] transposed = new int[maxCols][];
        for(int j = 0; j < maxCols; j++){
            int r = 0;
            for(int i = 0; i < rows; i++){
                if(j >= jaggedArray[i].length)
                    continue;
                r++;
            }
            transposed[j] = new int[r];
            r = 0;
            for(int i = 0; i < rows; i++){
                if(j >= jaggedArray[i].length)
                    continue;
                transposed[j][r++] = jaggedArray[i][j];
            }
        }

        /* merging ... */
        /* assuming ... rows = cols */
        merged = new int[rows][rows + maxCols];
        for(int i = 0; i < rows; i++){
            int rowLen = jaggedArray[i].length + transposed[i].length;
            merged[i] = new int[rowLen];
            int k = 0;
            /* from jagged array */
            for(int j = 0; j < jaggedArray[i].length; j++){
                merged[i][k++] = jaggedArray[i][j];
            }
            /* from transposed array */
            for(int j = 0; j < transposed[i].length; j++){
                merged[i][k++] = transposed[i][j];
            }
        }
    }

    public void printJaggedArray(){
        for(int i = 0; i < rows; i++){
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
    }

    public void printMergedArray(){
        for(int i = 0; i < rows; i++){
            System.out.println(Arrays.toString(merged[i]));
        }
    }

    public static void main(String[] args) {
        P002 p = new P002();
        p.getJaggedArray();
        System.out.println("Jagged Array.java: ");
        p.printJaggedArray();
        p.mergeArray();
        System.out.println("Merged Array.java: ");
        p.printMergedArray();
    }
}