package arraySolutions60to120;

import java.util.*;

public class Solution098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, remove all elements whose values appear more than three times in the array.
                Output the size of the changed array and all its elements.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = removeLessThanThree(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static int[] removeLessThanThree(int[] array) {
        Arrays.sort(array);

        List<Integer> resultList = new ArrayList<>();

        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count >= 3) {
                    for (int j = 0; j < count; j++) {
                        resultList.add(array[i - 1]);
                    }
                }
                count = 1;
            }
        }

        if (count >= 3) {
            for (int j = 0; j < count; j++) {
                resultList.add(array[array.length - 1]);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
