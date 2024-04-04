package forSlotions;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) is given. A sequence of real numbers AK is defined as:
                A1 = 1,A2 = 2,A(K) = (A(K−2) + 2·A(K−1))/3,K = 3, 4, … .
                Output terms A1, A2, …, AN of the sequence.
                """);
        System.out.print("Enter an integer N (> 1): ");
        int N = scanner.nextInt();

        System.out.println("Terms of the sequence:");
        double A1 = 1;
        double A2 = 2;
        System.out.println(A1);
        System.out.println(A2);

        for (int K = 3; K <= N; K++) {
            double AK = (A1 + 2 * A2) / 3;
            System.out.println(AK);

            A1 = A2;
            A2 = AK;
        }
    }
}
