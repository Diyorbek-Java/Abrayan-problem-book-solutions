package whileSolutions;


import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive real numbers A and B (A > B) are given.
                A segment of length A contains the greatest possible amount of segments of length B (without overlaps).
                Not using multiplication and division, find the amount of segments B, which are placed on the segment A.
                """);
        System.out.print("Enter number A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number B: ");
        double b = scanner.nextDouble();
        int segmentCount = 0;
        double unusedLength = a;
        while (unusedLength >= b) {
            unusedLength -= b;
            segmentCount++;
        }
        System.out.println("Number of segments of the length B is " + segmentCount);

    }
}
