package SeriesSolutions;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Positive integers K, N and a sequence of N real numbers A1, A2, …, AN are given. For each element of the sequence find its value raised to the power of K:
                (A(1))^K, (A(2))^K, …, (A(N))^K.
                """);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number K: ");
        int k = scanner.nextInt();

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
        for (int i = 0; i < n; i++) {
            System.out.print(Math.pow(sequence[i], k) + " ");
        }
        scanner.close();
    }
}
