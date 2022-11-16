//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandies = candies[0];
        for (int candy : candies) {
            if (candy > maxCandies)
                maxCandies = candy;
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies)
                ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}
