package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N integers is given. Increase all even numbers contained in
                the array by the initial value of the first even number in the array.
                If the array does not contain even numbers then do not change it.
                """);
        System.out.print("Enter the array size N: ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(int[] arrayA) {
        int firstEvenValue = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                firstEvenValue = arrayA[i];
                break;
            }
        }
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] += firstEvenValue;
        }
    }


}
