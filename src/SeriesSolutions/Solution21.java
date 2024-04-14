package SeriesSolutions;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) and a sequence of N real numbers are given.
                Output the logical value True if the values of elements are in ascending order, otherwise output False.
                """);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }

        boolean ascending = true;
        for (int i = 0; i < N - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                ascending = false;
                break;
            }
        }

        System.out.println("The sequence is in ascending order: " + ascending);

        scanner.close();
        scanner.close();
    }
}
