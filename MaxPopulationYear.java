//https://leetcode.com/problems/maximum-population-year/

public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
        int maxPop[] = new int[101]; //max death year(2050) - min birth year(1950) + 1

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                maxPop[j - 1950]++; //subtracting gives us first year when population is 1
            }
        }

        int maxYear = 1950, maxValue = 0;
        for (int i = 0; i < 101; i++) {
            if (maxPop[i] > maxValue) {
                maxValue = maxPop[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
