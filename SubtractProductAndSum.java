//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
import java.util.Scanner;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return (product-sum);
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = in.nextInt();
       System.out.println(subtractProductAndSum(n));
    }
}
