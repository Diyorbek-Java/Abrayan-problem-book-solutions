package SeriesSolutions;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 An integer K and a sequence of nonzero integers terminated by zero are given (the final zero is not an element of the sequence).
                 Output the amount of elements whose value less than K.
                """);
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();

        System.out.println("Enter the sequence of nonzero integers terminated by zero:");
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < K) {
                count++;
            }
        }

        System.out.println("The amount of elements whose value is less than " + K + ": " + count);
        scanner.close();
    }

}
