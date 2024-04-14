package SeriesSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N integers are given. The values of elements of the sequence are in ascending order,
                the sequence may contain equal elements. Output in the same order all distinct elements of the sequence.
                """);
        System.out.print("Enter the real number N: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];
        System.out.print("Enter the real number sequence: ");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        Arrays.sort(sequence);
        System.out.println("Array in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
        scanner.close();
    }
}
