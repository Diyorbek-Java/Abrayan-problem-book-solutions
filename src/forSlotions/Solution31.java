package forSlotions;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) is given. A sequence of real numbers AK is defined as:
                A0 = 2,AK = 2 + 1/AK−1, K = 1, 2, … .
                """);
        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        System.out.println("Sequence of real numbers AK:");
        double AK = 2;
        System.out.println(AK);

        for (int K = 1; K <= N; K++) {
            AK = 2 + 1 / AK;
            System.out.println(AK);
        }
    }
}
