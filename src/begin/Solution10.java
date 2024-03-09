package begin;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter non negative first number A = ");
        double a = scanner.nextDouble();
        System.out.print("Enter Second number B = ");
        double b = scanner.nextDouble();
        double sum=a+b;
        double difference=Math.round(a-b);

    }
}
