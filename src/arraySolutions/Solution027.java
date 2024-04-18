package arraySolutions;

import java.util.Scanner;

public class Solution027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N nonzero integers is given. If positive and negative numbers are alternated in the array then output 0,
                otherwise output the order number of the first element that breaks the above condition.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int result = checkAlternatingSigns(array);

        if (result == 0) {
            System.out.println("Positive and negative numbers are alternated in the array.");
        } else {
            System.out.println("The first violation occurs at index: " + result);
        }
    }

    public static int checkAlternatingSigns(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > 0 && array[i + 1] > 0) || (array[i] < 0 && array[i + 1] < 0)) {
                return i + 1;
            }
        }
        return 0;
    }

}
