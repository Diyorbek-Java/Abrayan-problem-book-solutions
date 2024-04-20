package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, perform the right shift of array elements on one position
                by assigning initial values of A(1), A(2), …, A(N−1) to elements A(2), A(3), …, A(N) respectively
                (an initial value of the last element will be lost). Assign zero value to the first element of the changed array.
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
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = 0;
    }


}
