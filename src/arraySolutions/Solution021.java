package arraySolutions;

import java.util.Scanner;

public class Solution021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers and two integers K and L (1 ≤ K ≤ L ≤ N) are given.
                Find the average of array elements with the order numbers in the range K to L inclusively.
                """);
        System.out.println("Enter size of array N : ");
        int n = scanner.nextInt();
        System.out.println("Enter number K (1 ≤ K ≤ L ≤ N) : ");
        int k = scanner.nextInt();
        System.out.println("Enter number L (1 ≤ K ≤ L ≤ N) : ");
        int l = scanner.nextInt();


        double[] numbers = new double[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();
        double sum = 0;
        for (int i = k; i < l; i++) {
            sum += numbers[i];
        }
        double average = sum / (l - k);
        System.out.println("The average of array elements is from K to L : " + average);
    }

}
