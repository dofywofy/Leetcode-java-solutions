//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinCostToMoveChip {
    public static void main(String[] args) {
        int[] position = {1, 1000000000};
        System.out.println(minCostToMoveChips(position));
    }

    static int minCostToMoveChips(int[] position) {
        int evenCost = 0;
        int oddCost = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenCost++;
            } else {
                oddCost++;
            }
        }
        return Math.min(oddCost, evenCost);
    }
}
