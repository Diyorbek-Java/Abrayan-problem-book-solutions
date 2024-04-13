package SeriesSolutions;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given ten real numbers, find their product.");
        double product = 1;
        for (int i = 0; i < 10; i++) {
            double n = scanner.nextDouble();
            product = product * n;
        }
        System.out.println("The product is: " + product);
        scanner.close();
    }
}
