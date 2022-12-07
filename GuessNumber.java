//https://leetcode.com/problems/guess-number-higher-or-lower/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long start = 1, end = n, mid;
        
        while (start <= end) {
            
            mid = start + (end - start) / 2;

            if (guess((int)mid) == 0) return (int)mid;
            else if (guess((int)mid) == 1) start = mid + 1;
            else end = mid - 1; 
        }
        return -1;
    }
}
