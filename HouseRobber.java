//https://leetcode.com/problems/house-robber/

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    static int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(i + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob1;
    }
}
