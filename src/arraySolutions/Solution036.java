package arraySolutions;

import java.util.Scanner;

public class Solution036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the maximum among array elements that
                are neither local minimum nor local maximum (see the definitions of local minimum and local maximum in Array32 and Array33 respectively).
                If the array does not contain such elements then output 0 (as a real number).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        double[] notMinMaxElements = findNotMinMaxElements(array);

        if (notMinMaxElements.length > 0) {
            System.out.println("The maximum among elements that are neither local minimum nor local maximum is: " + findMax(notMinMaxElements));
        } else {
            System.out.println("No such elements found. Output is 0.");
        }

    }

    public static double[] findNotMinMaxElements(double[] array) {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (!isLocalMinimum(array, i) && !isLocalMaximum(array, i)) {
                count++;
            }
        }

        double[] notMinMaxElements = new double[count];
        int index = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (!isLocalMinimum(array, i) && !isLocalMaximum(array, i)) {
                notMinMaxElements[index++] = array[i];
            }
        }

        return notMinMaxElements;
    }

    public static boolean isLocalMinimum(double[] array, int index) {
        return array[index] < array[index - 1] && array[index] < array[index + 1];
    }

    public static boolean isLocalMaximum(double[] array, int index) {
        return array[index] > array[index - 1] && array[index] > array[index + 1];
    }

    public static double findMax(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
