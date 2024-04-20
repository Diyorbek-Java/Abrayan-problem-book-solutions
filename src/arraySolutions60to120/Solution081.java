package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers and an integer K (1 ≤ K < N), perform the right shift of array
                elements on K positions by assigning initial values of A(1), A(2), …, A(N−K) to elements A(K+1), A(K+2), …, A(N)
                respectively (an initial value of the last K elements will be lost). Assign zero value to the first K elements of the changed array.
                """);

        System.out.print("Enter the array size :  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        System.out.println("Enter number K: ");
        int k = scanner.nextInt();
        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA, k);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array, int k) {
        for (int i = array.length - 1; i >= k; i--) {
            array[i] = array[i - k];
        }

        for (int i = 0; i < k; i++) {
            array[i] = 0;
        }

    }


}
