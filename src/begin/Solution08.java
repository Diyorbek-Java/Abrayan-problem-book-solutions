package begin;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To find average enter number A = ");
        double a = scanner.nextDouble();
        System.out.print("Enter number B = ");
        double b = scanner.nextDouble();
        double average = (a + b) / 2;
        System.out.printf("Average of (%s,%s) is %s", a, b, average);
    }
}
