//https://leetcode.com/problems/spiral-matrix-iii/

import java.util.Arrays;

public class SpiralMatrix3 {
    public static void main(String[] args) {
        int rows = 1, cols = 4, rStart = 0, cStart = 0;
        System.out.println(Arrays.deepToString(spiralMatrixIII(rows, cols, rStart, cStart)));
    }

    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] spiralMatrix= new int[rows * cols][2];
        int i = 0;
        spiralMatrix[i++] = new int[]{rStart, cStart};
        int len = 0;
        int d = 0;
        int[] directions = new int[]{0, 1, 0, -1, 0};

        while (i < rows * cols) {
            if (d == 0 || d == 2) {
                len++;
            }
            for (int j = 0; j < len; j++) {
                rStart += directions[d];
                cStart += directions[d + 1];
                if (rStart < rows && rStart >= 0 && cStart < cols && cStart >=0) {
                    spiralMatrix[i++] = new int[]{rStart, cStart};
                }
            }

            d = ++d % 4;
        }

        return spiralMatrix;
    }
}
