//https://leetcode.com/problems/search-insert-position/

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length;

        while (start < end){

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
