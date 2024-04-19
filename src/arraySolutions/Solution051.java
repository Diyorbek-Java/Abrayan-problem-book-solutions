package arraySolutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two arrays A and B of N real numbers are given. Exchange the contents of
                the given arrays and output elements of the changed array A and then output elements of the changed array B.
                """);
        System.out.print("Enter The size of the array A: ");
        int aSize = scanner.nextInt();
        double[] arrayA = new double[aSize];
        System.out.print("Enter Elements of the Array A: ");
        for (int i = 0; i < aSize; i++)
            arrayA[i] = scanner.nextDouble();

        System.out.print("Enter The size of the array B: ");
        int bSize = scanner.nextInt();
        double[] arrayB = new double[bSize];
        for (int i = 0; i < bSize; i++)
            arrayB[i] = scanner.nextInt();

        scanner.close();

        System.out.println("A array elements :");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("B array elements :");
        System.out.println(Arrays.toString(arrayB));

        changeElements(arrayA, arrayB);

        System.out.println("A array changed elements :");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("B array changed elements :");
        System.out.println(Arrays.toString(arrayB));
    }

    public static void changeElements(double[] arrayA, double[] arrayB) {
        int aSize = arrayA.length;
        int bSize = arrayB.length;
        int maxSize = Math.max(aSize, bSize);
        if (maxSize == bSize) {
            for (int i = 0; i < aSize; i++) {
                double temp = arrayA[i];
                arrayA[i] = arrayB[i];
                arrayB[i] = temp;
            }
        } else {
            for (int i = 0; i < aSize; i++) {
                double temp = arrayA[i];
                arrayA[i] = arrayB[i];
                arrayB[i] = temp;
            }
        }
    }
}
