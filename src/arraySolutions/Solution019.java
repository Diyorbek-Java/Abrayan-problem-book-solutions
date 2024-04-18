package arraySolutions;

import java.util.Scanner;

public class Solution019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of 10 integers is given. Output the order number of the last element A(K)
                that satisfies the following double inequality: A1 < A(K) < A10. If the array does not
                contain such elements then output 0.
                """);
        int n = 10;
        int[] numbers = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();
        int target = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < numbers[n - 1] && numbers[1] < numbers[i]) {
                target = numbers[i];
            }
        }
        if (target == -1) {
            System.out.println("Last element satisfying the inequality: " + target);
        } else {
            System.out.println("No such element" + 0);
        }

    }

}
