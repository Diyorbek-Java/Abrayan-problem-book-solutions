package arraySolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, find the maximal amount of its elements with equal values.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Given array: ");
        System.out.println(Arrays.toString(array));

        int[] mostRepeatedElement = findMaximalAmountOfElements(array);
        System.out.printf("The most repeated element in the array is: %d it is repeated %d times", mostRepeatedElement[0], mostRepeatedElement[1]);

    }

    public static int[] findMaximalAmountOfElements(int[] array) {
        int[] result = new int[2];
        if (array == null || array.length == 0) return result;
        int count = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    result[0] = i;
                }
            }
        }
        result[1] = count;
        return result;
    }


}
