package arraySolutions;

import java.util.Scanner;

public class Solution025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N nonzero integers is given. If the array elements represent
                a geometric sequence with integer common ratio (see Array4) then output its common ratio, otherwise output 0.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int commonRatio = findCommonRatio(array);

        if (commonRatio != 0) {
            System.out.println("The array forms a geometric sequence with a common ratio of " + commonRatio + ".");
        } else {
            System.out.println("The array does not form a geometric sequence.");
        }

    }

    private static int findCommonRatio(int[] array) {
        if (array.length < 2) {
            return 0;
        }

        int commonRatio = array[1] / array[0];

        for (int i = 2; i < array.length; i++) {
            if (array[i] / array[i - 1] != commonRatio) {
                return 0;
            }
        }

        return commonRatio;
    }

}
