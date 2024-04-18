package arraySolutions;

import java.util.Scanner;

public class Solution026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N integers is given. If odd and even numbers are alternated in the array then output 0,
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

        int result = checkAlternatingNumbers(array);

        if (result == 0) {
            System.out.println("Odd and even numbers are alternated in the array.");
        } else {
            System.out.println("The first violation occurs at index: " + result);
        }
    }

    public static int checkAlternatingNumbers(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0) || (array[i] % 2 != 0 && array[i + 1] % 2 != 0)) {
                return i + 1;
            }
        }
        return 0;
    }

}
