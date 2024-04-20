package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, perform the left cyclic shift of array elements on
                one position by assigning initial values of A(N), A(N−1), …, A(2), A(1) to elements A(N−1), A(N−2), …, A(1), A(N) respectively.
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
        double temp = array[0];

        for (int i = 1; i < N; i++) {
            array[i - 1] = array[i];
        }

        array[N - 1] = temp;
    }

}
