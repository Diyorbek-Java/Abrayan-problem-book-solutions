package SeriesSolutions;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N real numbers A1, A2, …, AN are given. Output the following numbers:
                (A(1))^N, (A(2))^(N−1), …, (A(N−1))^2, A(N)
                """);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println("Given Values of the square: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");

        }
        System.out.println("Changed values of the sequence elements: ");
        int temp = n;
        for (int i = 0; i < n; i++) {
            System.out.print(Math.pow(sequence[i], temp--) + " ");
        }
        scanner.close();
    }
}
