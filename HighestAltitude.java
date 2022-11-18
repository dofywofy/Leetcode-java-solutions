//https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int highest = 0, max = 0;

        for (int i = 0; i < gain.length; i++) {
            highest = highest + gain[i];
            if (highest > max)
                max = highest;
        }
        return max;
    }
}