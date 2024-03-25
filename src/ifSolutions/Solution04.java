package ifSolutions;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution identifies amount of positive number in given 3 integer numbers ");
        System.out.print("Please enter first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter second number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Please enter third number : ");
        int number3 = scanner.nextInt();
        int positiveNumbers = 0;
        if (number1 > 0) {
            positiveNumbers++;
        }
        if (number2 > 0) {
            positiveNumbers++;
        }
        if (number3 > 0) {
            positiveNumbers++;
        }
        System.out.printf("So thi numbers are first = %d, second  = %d," +
                " third = %d, amount of positive numbers is %d ", number1, number2, number3, positiveNumbers);

    }
}
