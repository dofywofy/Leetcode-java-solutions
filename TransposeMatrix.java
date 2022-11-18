//https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] transpose(int[][] matrix) {
        int rowSize = matrix.length, colSize = matrix[0].length;
        int[][] transpose = new int[colSize][rowSize];

        for (int j = 0; j < colSize; j++)
            for (int i = 0; i < rowSize; i++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }
}
