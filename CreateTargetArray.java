//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > index[i]; j--) {
                targetArr[j] = targetArr[j - 1];
            }
            targetArr[index[i]] = nums[i];
        }
        return targetArr;
    }
}
