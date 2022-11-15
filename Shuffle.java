//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

/*    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans [2 * i] = nums [i];
            ans [2 * i + 1] = nums [n + i];
        }
        return ans;
    }
*/
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[i /2];
            }
            else
                ans[i] = nums[n + i / 2];
        }
        return ans;
    }
}
