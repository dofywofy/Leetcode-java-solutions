//https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int firstMissing = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }
}
