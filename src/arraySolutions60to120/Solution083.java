package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, perform the right cyclic shift of array elements on
                one position by assigning initial values of A(1), A(2), …, A(N−1), A(N) to elements A(2), A(3), …, A(N), A(1) respectively.
                """);

        System.out.print("Enter the array size:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array) {
        int N = array.length;
        double temp = array[N - 1];

        for (int i = N - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = temp;
    }

}
