package SeriesSolutions;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N integers are given.
                The sequence contains at least two zero-valued elements.
                Output the sum of the values of elements placed between the first and the last zero-valued elements.
                If the first and the last zero-valued elements are placed side by side then output 0.
                """);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        int startZero = 0;
        int endZero = n;
        boolean check = true;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sequence[i] == 0 && check) {
                startZero = i;
                check = false;
            }
            if (sequence[i] == 0 && !check) {
                endZero = i;
            }
        }
        for (int i = startZero; i < endZero; i++) {
            sum += sequence[i];
        }

        scanner.close();
    }
}
