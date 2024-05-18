package Assignments;

public class P11a {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 5, 6},
                {3, 4, 5, 3},
                {5, 6, 7, 8},
                {7, 8, 9, 10}
        };

        int[][] B = {
                {5, 6, 7, 8},
                {7, 8, 9, 10},
                {9, 10, 11, 12},
                {11, 12, 13, 14}
        };

        int[][] C = Strassen.strassenMultiplication(A, B);

        System.out.println("Result of Strassen's Multiplication:");
        Strassen.printMatrix(C);
    }
}

class Strassen{
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    public static int[][] strassenMultiplication(int[][] A, int[][] B) {
        int n = A.length;
        if (n == 1) {
            int[][] C = new int[1][1];
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int newSize = n / 2;
        int[][] a11 = new int[newSize][newSize];
        int[][] a12 = new int[newSize][newSize];
        int[][] a21 = new int[newSize][newSize];
        int[][] a22 = new int[newSize][newSize];

        int[][] b11 = new int[newSize][newSize];
        int[][] b12 = new int[newSize][newSize];
        int[][] b21 = new int[newSize][newSize];
        int[][] b22 = new int[newSize][newSize];

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                a11[i][j] = A[i][j];
                a12[i][j] = A[i][j + newSize];
                a21[i][j] = A[i + newSize][j];
                a22[i][j] = A[i + newSize][j + newSize];

                b11[i][j] = B[i][j];
                b12[i][j] = B[i][j + newSize];
                b21[i][j] = B[i + newSize][j];
                b22[i][j] = B[i + newSize][j + newSize];
            }
        }

        // Calculate the seven products
        int[][] m1 = strassenMultiplication(addMatrices(a11, a22), addMatrices(b11, b22)); // M1 = (A11 + A22) * (B11 + B22)
        int[][] m2 = strassenMultiplication(addMatrices(a21, a22), b11); // M2 = (A21 + A22) * B11
        int[][] m3 = strassenMultiplication(a11, subtractMatrices(b12, b11)); // M3 = A11 * (B12 - B11)
        int[][] m4 = strassenMultiplication(a22, subtractMatrices(b21, b11)); // M4 = A22 * (B21 - B11)
        int[][] m5 = strassenMultiplication(addMatrices(a11, a12), b22); // M5 = (A11 + A12) * B22
        int[][] m6 = strassenMultiplication(subtractMatrices(a21, a11), addMatrices(b11, b22)); // M6 = (A21 - A11) * (B11 + B22)
        int[][] m7 = strassenMultiplication(subtractMatrices(a12, a22), addMatrices(b21, b22)); // M7 = (A12 - A22) * (B21 + B22)

        int[][] c11 = addMatrices(subtractMatrices(addMatrices(m1, m4), m5), m7); // C11 = M1 + M4 - M5 + M7
        int[][] c12 = addMatrices(m3, m5); // C12 = M3 + M5
        int[][] c21 = addMatrices(m2, m4); // C21 = M2 + M4
        int[][] c22 = addMatrices(subtractMatrices(addMatrices(m1, m3), m2), m6); // C22 = M1 + M3 - M2 + M6

        int[][] C = new int[n][n];
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                C[i][j] = c11[i][j];
                C[i][j + newSize] = c12[i][j];
                C[i + newSize][j] = c21[i][j];
                C[i + newSize][j + newSize] = c22[i][j];
            }
        }
        return C;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
    }
}

/*
* Time Complexity : O(n^2.81)
* Space Complexity: O(n^2)
* */