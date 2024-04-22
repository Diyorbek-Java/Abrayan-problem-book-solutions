package arraySolutions60to120;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N integers is given. The array contains at least one series of two or more equal numbers.
                Decrease each series of equal numbers of the array by one element (see the series definition in Array116).
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        int[] modifiedArray = decreaseSeriesByOne(arrayA);


        System.out.println("Modified array:");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }

    }

    public static int[] decreaseSeriesByOne(int[] array) {
        ArrayList<Integer> modifiedList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            modifiedList.add(array[i]);

            if (i < array.length - 1 && array[i] != array[i + 1]) {
                if (i > 0 && array[i] == array[i - 1]) {
                    modifiedList.remove(modifiedList.size() - 1);
                }
            }
        }

        int[] modifiedArray = new int[modifiedList.size()];
        for (int i = 0; i < modifiedList.size(); i++) {
            modifiedArray[i] = modifiedList.get(i);
        }

        return modifiedArray;
    }
}
