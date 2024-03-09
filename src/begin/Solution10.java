package begin;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter non negative first number A = ");
        double a = scanner.nextDouble();
        System.out.print("Enter Second number B = ");
        double b = scanner.nextDouble();
        double sum = a + b;
        double difference = Math.abs(a - b);
        double product = a * b;
        double quotient = Math.sqrt(a) / Math.sqrt(b);
        System.out.printf("With in the given numbers(%s,%s) sum = %s,difference = %s,", a, b, sum, difference);
        System.out.printf("\nproduct = %s,quotient of their squares = %s ", product, quotient);


    }
}
