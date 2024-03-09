package begin;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello there the purpose of this solution is finding different values like sum,...");
        System.out.print("\nSo you need to insert 2 digits let's start  A = ");
        double a = scanner.nextDouble();
        System.out.print("let's insert for the second one B = ");
        double b = scanner.nextDouble();
        double sum = a + b;
        double difference = Math.abs(a - b);
        double product = a * b;
        double quotient = Math.abs(a) / Math.abs(b);
        System.out.printf("So the results for (%s,%s) sum = %s", a, b, sum);
        System.out.printf("\ndifference = %s, product = %s, quotient of their absolute values = %s", difference, product, quotient);
    }
}
