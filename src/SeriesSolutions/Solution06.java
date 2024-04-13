package SeriesSolutions;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 An integer N and a sequence of N positive real numbers are given.
                 Output in the same order the fractional parts of all elements of this sequence (as real numbers with zero integer part).
                 Also output the product of all fractional parts.
                """);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }
        double productFractionalParts = 1;
        System.out.println("Fractional parts of the sequence:");
        for (int i = 0; i < N; i++) {
            double fractionalPart = sequence[i] - (int) sequence[i];
            productFractionalParts *= fractionalPart;
            System.out.print(fractionalPart + " ");
        }
        System.out.println();

        System.out.println("Product of all fractional parts: " + productFractionalParts);
        scanner.close();
    }
}
