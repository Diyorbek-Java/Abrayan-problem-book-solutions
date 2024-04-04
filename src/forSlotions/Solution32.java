package forSlotions;

import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) is given. A sequence of real numbers AK is defined as:
                A0 = 1,        AK = (AK−1 + 1)/K,    K = 1, 2, … .
                Output terms A1, A2, …, AN of the sequence.""");
        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double AKMinus1 = 1;

        System.out.println("Terms of the sequence:");
        System.out.println(AKMinus1);

        for (int K = 1; K <= N; K++) {
            double AK = (AKMinus1 + 1) / K;
            System.out.println(AK);
            AKMinus1 = AK;
        }
    }
}
