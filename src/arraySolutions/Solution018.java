package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of 10 nonzero integers is given. Output the value of the first element
                A(K) that satisfies the following inequality: A(K) < A(10).
                If the array does not contain such elements then output 0.
                """);
        int n = 10;
        int[] numbers = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();
        int target = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < numbers[n - 1]) {
                target = numbers[i];
                break;
            }
        }
        if (target == -1) {
            System.out.println("First element satisfying the inequality: " + target);
        } else {
            System.out.println("No such element" + 0);
        }

    }

}
