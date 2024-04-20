package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers and an integer K (1 ≤ K ≤ 4, K < N), perform the left
                cyclic shift of array elements on K positions by assigning initial values of A(N), A(N−1), …, A(1)
                to elements A(N−K), A(N−K−1), …, A(N−K+1) respectively. An additional array of 4 elements
                may be used for performing the required shift.
                """);

        System.out.print("Enter the array size:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        System.out.print("Enter integer K: ");
        int k = scanner.nextInt();
        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA, k);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array, int k) {
        int n = array.length;

        double[] temp = new double[k];

        for (int i = 0; i < k; i++)
            temp[i] = array[i];

        for (int i = k; i < n; i++)
            array[i - k] = array[i];

        for (int i = 0; i < k; i++)
            array[n - k + i] = temp[i];

    }

}
