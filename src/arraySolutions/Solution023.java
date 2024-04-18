package arraySolutions;

import java.util.Scanner;

public class Solution023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers and two integers K and L (1 < K ≤ L ≤ N) are given.
                Find the average of all array elements except ones with the order numbers in the range K to L inclusively.
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i < k - 1 || i > l - 1) {
                sum += numbers[i];
                count++;
            }
        }
        double average = sum / count;

        System.out.println("Average of array elements except ones in the range " + k + " to " + l + " inclusively: " + average);
    }

}
