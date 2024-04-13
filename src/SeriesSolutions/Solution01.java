package SeriesSolutions;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given ten real numbers, find their sum.");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            sum += n;
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
