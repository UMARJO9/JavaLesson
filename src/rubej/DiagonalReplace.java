package rubej;

import java.util.Arrays;

public class DiagonalReplace {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 10;
        }
        IO.println("Массив после замены главной диагонали на 10:");
        for (int[] row : matrix) {
            IO.println(Arrays.toString(row));
        }
    }
}
