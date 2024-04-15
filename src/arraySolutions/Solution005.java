package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();

        int[] sequence = generateSequence(N);

        System.out.println("Initial terms of the Fibonacci sequence:");
        System.out.println(Arrays.toString(sequence));
        scanner.close();
    }

    public static int[] generateSequence(int N) {
        int[] sequence = new int[N];
        sequence[0] = 1;
        sequence[1] = 1;

        for (int i = 2; i < N; i++) {
            sequence[i] = sequence[i - 2] + sequence[i - 1];
        }

        return sequence;
    }


}
