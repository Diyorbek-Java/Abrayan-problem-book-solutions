package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N integers is given. If the array is a permutation (i. e., if the array
                contains all integers in the range 1 to N) then output 0, otherwise output the order
                number of the first inadmissible element.
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

        int result = checkPermutation(array);

        System.out.println("Result: " + result);
    }

    public static int checkPermutation(int[] array) {
        int N = array.length;
        boolean[] seen = new boolean[N + 1];

        for (int i = 0; i < N; i++) {
            if (array[i] < 1 || array[i] > N || seen[array[i]]) {
                return i + 1;
            }
            seen[array[i]] = true;
        }
        return 0;
    }

}
