package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N integers is given, the array contains two elements with equal values.
                Find these elements and output their order numbers in ascending order.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Given Array: ");
        System.out.println(Arrays.toString(array));
        int[] equalValues = findEqualValues(array);
        System.out.printf("The order of equal elements are %s", Arrays.toString(equalValues));
    }

    public static int[] findEqualValues(int[] array) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


}
