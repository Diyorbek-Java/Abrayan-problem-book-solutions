package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the first term (A): ");
        double A = scanner.nextDouble();

        System.out.print("Enter the common ratio (R): ");
        double R = scanner.nextDouble();

        scanner.close();

        double[] sequence = generateSequence(N, A, R);

        System.out.println("Initial terms of the geometric sequence:");
        System.out.println(Arrays.toString(sequence));
    }

    public static double[] generateSequence(int N, double A, double R) {
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = A * Math.pow(R, i);
        }
        return sequence;
    }

}
