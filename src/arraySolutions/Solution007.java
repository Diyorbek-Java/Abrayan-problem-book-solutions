package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the number (A): ");
        int A = scanner.nextInt();
        System.out.print("Enter the number (B): ");
        int B = scanner.nextInt();


        int[] sequence = generateSequence(N, A, B);

        System.out.println("Array generated:");
        System.out.println(Arrays.toString(sequence));
        scanner.close();
    }

    public static int[] generateSequence(int N, int A, int B) {
        int[] sequence = new int[N];
        sequence[0] = A;
        sequence[1] = B;

        for (int i = 2; i < N; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }
}
