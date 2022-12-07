//https://leetcode.com/problems/valid-perfect-square/

public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        long start = 1, end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sqOfMid = mid * mid;

            if (sqOfMid > num) {
                end = mid - 1;
            }
            else if (sqOfMid < num) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
