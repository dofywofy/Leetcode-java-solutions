//https://leetcode.com/problems/reshape-the-matrix/


public class ReshapeMatrix {
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if((rows * cols) != (r * c)) return mat;

        int[][] newMat = new int[r][c];
        int newRow = 0;
        int newCol = 0;


        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                newMat[newRow][newCol] = mat[i][j];
                newCol++;

                if(newCol == c)
                {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        return newMat;
    }
}
