package arraySolutions;

import java.util.Scanner;

public class Solution024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N distinct integers is given.
                If the array elements represent an arithmetic sequence
                (see Array3) then output its common difference, otherwise output 0.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int commonDifference = findCommonDifference(array);

        if (commonDifference != 0) {
            System.out.println("The array forms an arithmetic sequence with a common difference of " + commonDifference + ".");
        } else {
            System.out.println("The array does not form an arithmetic sequence.");
        }

    }

    public static int findCommonDifference(int[] array) {
        if (array.length < 2) {
            return 0;
        }

        int commonDifference = array[1] - array[0];

        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != commonDifference) {
                return 0;
            }
        }

        return commonDifference;
    }

}
