package forSlotions;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) and two points A, B (A < B) on the real axis are given.
                The segment [A, B] is divided into N sub-segments of equal length.
                Output the length H of each sub-segment and then
                output the values of a function F(X) = 1 − sin(X) at points dividing the segment [A, B]:
                F(A),F(A + H), F(A + 2·H),…,F(B).
                """);
        System.out.print("Enter an integer N (> 1): ");
        int N = scanner.nextInt();

        System.out.print("Enter point A: ");
        double A = scanner.nextDouble();
        System.out.print("Enter point B (B > A): ");
        double B = scanner.nextDouble();

        double H = (B - A) / N;

        System.out.println("The length of each sub-segment is: " + H);

        System.out.println("Values of F(X) = 1 - sin(X) at points dividing the segment [A, B]:");
        for (int i = 0; i <= N; i++) {
            double X = A + i * H;
            double result = 1 - Math.sin(X);
            System.out.println(result);
        }
    }
}
