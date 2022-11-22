//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n == 1) ans[0] = 0;

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                ans[i] = -i;
                ans[n - i - 1] = i;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                ans[i] = -i;
                ans[n / 2] = 0;
                ans[n - i - 1] = i;
            }
        }
        return ans;
    }
}
