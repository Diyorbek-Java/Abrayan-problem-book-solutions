package SeriesSolutions;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
               A real number B, an integer N and a sequence of N real numbers are given.
               The values of elements of the sequence are in ascending order.
               Output the number B jointly with the elements of the sequence so that all output numbers were in ascending order
               """);
        System.out.print("Enter the real number B: ");
        double B = scanner.nextDouble();

        System.out.print("Enter the number of elements in the sequence: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers in ascending order:");
        double[] sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }

        sequence = insertIntoAscendingOrder(sequence, B);

        System.out.println("Number B and the sequence in ascending order:");
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
        scanner.close();
    }
    public static double[] insertIntoAscendingOrder(double[] sequence, double B) {
        double[] newSequence = new double[sequence.length + 1];
        boolean inserted = false;
        for (int i = 0, j = 0; i < sequence.length; i++, j++) {
            if (!inserted && B < sequence[i]) {
                newSequence[j] = B;
                inserted = true;
                j++;
            }
            newSequence[j] = sequence[i];
        }
        if (!inserted) {
            newSequence[newSequence.length - 1] = B;
        }
        return newSequence;
    }

}
