package SeriesSolutions;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N integers are given.
                Output in the same order all even-valued elements of the sequence and also their amount K.
                """);
        System.out.print("Enter number N : ");
        int n = scanner.nextInt();
        System.out.print("Enter the sequence of real numbers:");
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        int sum = 0;
        System.out.print("Even Numbers are: ");
        for (int i = 0; i < n; i++) {
            if (sequence[i] % 2 == 1) {
                sum += sequence[i];
                System.out.print(" " + sequence[i]);
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers: " + sum);
        scanner.close();
    }

}
