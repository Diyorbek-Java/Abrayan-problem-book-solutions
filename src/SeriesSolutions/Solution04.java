package SeriesSolutions;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }
        double sum = 0;
        double product = 1;
        for (int i = 0; i < N; i++) {
            sum += sequence[i];
            product *= sequence[i];
        }

        System.out.println("Sum of the sequence: " + sum);
        System.out.println("Product of the sequence: " + product);
        scanner.close();
    }
}
