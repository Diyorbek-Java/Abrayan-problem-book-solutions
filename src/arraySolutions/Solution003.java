package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int N = scanner.nextInt();
        System.out.println("Enter the number A: ");
        int A = scanner.nextInt();
        System.out.println("Enter the number D: ");
        int D = scanner.nextInt();
        double[] sequence = generateSequence(N, A, D);

        System.out.println("Initial terms of the arithmetic sequence:");
        System.out.println(Arrays.toString(sequence));
        scanner.close();
    }

    public static double[] generateSequence(int N, double A, double D) {
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = A + i * D;
        }
        return sequence;
    }
}
