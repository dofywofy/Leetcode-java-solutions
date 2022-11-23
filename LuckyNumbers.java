//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int[] minRow = new int[matrix.length];
        int[] maxCol = new int[matrix[0].length];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        List<Integer> lucky = new ArrayList<Integer>();
        
        for (int i = 0; i < matrix.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minRow[i] = min;
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            maxCol[i] = max;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < minRow.length; i++) {
            for (int j = 0; j < maxCol.length; j++) {
                if (minRow[i] == maxCol[j]) {
                    ans.add(minRow[i]);
                }
            }
        }
        return ans;
    }
}
