//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        if (checkIfEqual(mat, target)) //check at 0 degree rotation
            return true;

        rotateMatrix(mat, target); //rotate and check at 90 degrees
        if (checkIfEqual(mat, target))
            return true;

        rotateMatrix(mat, target); //rotate and check at 180 degrees
        if (checkIfEqual(mat, target))
            return true;

        rotateMatrix(mat, target); //rotate and check at 270 degrees
        if (checkIfEqual(mat, target))
            return true;

        return false;
    }

    public static int[][] rotateMatrix(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] rotMat = new int[mat.length][mat.length];
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][i];
                mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                mat[j][n - 1 - i] = temp;

                rotMat[i][j] = mat[i][j];
            }
        }
        return rotMat;
    }

    public static boolean checkIfEqual (int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
