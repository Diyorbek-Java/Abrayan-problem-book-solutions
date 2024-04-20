package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers and an integer K (1 ≤ K < N), perform the left shift of array
                elements on K positions by assigning initial values of A(N), A(N−1), …, A(K+1) to elements A(N−K),
                A(N−K−1), …, A(1) respectively (an initial value of the first K elements will be lost).
                Assign zero value to the last K elements of the changed array.
                """);

        System.out.print("Enter the array size:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        System.out.println("Enter number K: ");
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

        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }

        for (int i = k; i < n; i++) {
            array[i - k] = array[i];
        }

        for (int i = n - k; i < n; i++) {
            if (i < n - k + temp.length) {
                array[i] = temp[i - (n - k)];
            } else {
                array[i] = 0;
            }
        }
    }
}
