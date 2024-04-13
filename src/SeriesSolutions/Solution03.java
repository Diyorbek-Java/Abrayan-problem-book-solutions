package SeriesSolutions;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given ten real numbers, find their average.");
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            double n = scanner.nextDouble();
            sum+=n;
        }
        double average = sum/10;
        System.out.println("The product is: " + average);
        scanner.close();
    }
}
