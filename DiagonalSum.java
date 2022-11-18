//https://leetcode.com/problems/matrix-diagonal-sum/

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}
