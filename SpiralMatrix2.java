//https://leetcode.com/problems/spiral-matrix-ii/

import java.util.Arrays;


public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    static int[][] generateMatrix(int n) {
        int[][] spiralMatrix2 = new int[n][n];

        int top = 0, left = 0, bottom = n - 1, right = n - 1, num = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiralMatrix2[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiralMatrix2[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralMatrix2[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralMatrix2[i][left] = num++;
                }
                left++;
            }
        }
        return spiralMatrix2;
    }
}
