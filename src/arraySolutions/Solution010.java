package arraySolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, output all even numbers contained in the array in ascending order of their indices and
                then output all odd numbers contained in the array in descending order of their indices.
                """);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();


        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers.add(numbers[i]);
            } else {
                oddNumbers.add(numbers[i]);
            }
        }

        System.out.println("Even numbers in the array and their indices:");
        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.println("Index " + i + ": " + evenNumbers.get(i));
        }

        System.out.println("Odd numbers in the array and their indices:");
        for (int i = oddNumbers.size() - 1; i >= 0; i--) {
            System.out.println("Index " + (n - i - 1) + ": " + oddNumbers.get(i));
        }
    }

}
