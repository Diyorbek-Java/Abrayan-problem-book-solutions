package SeriesSolutions;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) and a sequence of N real numbers are given.
                Output 0 if the values of elements are in descending order,
                otherwise output the order number of the first element that breaks the required order.
                """);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }

        int orderNumber = 0;
        for (int i = 0; i < N - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                orderNumber = i + 1;
                break;
            }
        }

        if (orderNumber == 0) {
            System.out.println("0");
        } else {
            System.out.println(orderNumber + 1);
        }
        scanner.close();
    }
}
