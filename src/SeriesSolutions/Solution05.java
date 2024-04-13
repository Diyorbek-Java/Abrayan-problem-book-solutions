package SeriesSolutions;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N positive real numbers are given. Output in the same order
                the integer parts of all elements of this sequence (as real numbers with zero fractional part). Also output the sum of all integer parts.
                """);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }
        double sumIntegerParts = 0;
        System.out.println("Integer parts of the sequence:");
        for (int i = 0; i < N; i++) {
            int integerPart = (int) sequence[i];
            sumIntegerParts += integerPart;
            System.out.print(integerPart + " ");
        }
        System.out.println();

        System.out.println("Sum of all integer parts: " + sumIntegerParts);
        scanner.close();
    }
}
