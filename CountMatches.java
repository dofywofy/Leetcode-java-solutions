//https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int checkRule = 0;

        if (ruleKey.equals("color")) checkRule = 1;
        else if (ruleKey.equals("name")) checkRule = 2;

        for (int i = 0; i < items.size(); i++) {
            if ((items.get(i).get(checkRule)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
