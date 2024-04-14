package SeriesSolutions;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) and a sequence of N integers are given.
                Output the elements that are less than their right-side neighbor. Also output the amount K of such elements.
                """);
        System.out.print("Enter the real number N: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];
        System.out.print("Enter the real number sequence: ");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println("Those are the elements that are less than their left-side neighbors.");
        for (int i = 0; i < n - 1; i++) {
            if (sequence[i] < sequence[i + 1]) {
                System.out.print(sequence[i] + " ");
            }
        }
        scanner.close();
    }
}
