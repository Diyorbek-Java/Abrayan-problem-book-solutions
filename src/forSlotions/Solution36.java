package forSlotions;

import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given positive integers N and K, find the sum
                1^K + 2^K + … + N^K.
                To avoid the integer overflow, compute the sum using real variables and output the result as a real number.
                """);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        System.out.print("Enter a positive integer K: ");
        int K = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, K);
        }

        System.out.println("The sum is: " + sum);

    }
}
