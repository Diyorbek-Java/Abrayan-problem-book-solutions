package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, perform the left shift of array elements on one position by
                assigning initial values of A(N), A(N−1), …, A(2) to elements A(N−1), A(N−2), …, A1 respectively
                (an initial value of the first element will be lost). Assign zero value to the last element of the changed array.
                """);

        System.out.print("Enter the array  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;

    }


}
