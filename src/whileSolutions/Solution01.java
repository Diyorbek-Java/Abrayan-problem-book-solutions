package whileSolutions;


import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive real numbers A and B (A > B) are given.
                A segment of length A contains the greatest possible amount of segments of length B (without overlaps).
                Not using multiplication and division, find the length of unused part of the segment A.
                """);
        System.out.print("Enter number A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number B: ");
        double b = scanner.nextDouble();
        double length = a;
        while (length >= b) {
            length -= b;
        }
        System.out.println("Unused length is " + length);

    }
}
