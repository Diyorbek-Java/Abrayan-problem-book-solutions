package ifSolutions;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution compares 2 number and shows the smaller one ");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        if (num1 < num2) {
            System.out.printf("The smaller value is %d", num1);
        } else if (num1 > num2) {
            System.out.printf("the smaller number is %d", num2);
        } else {
            System.out.printf("Both first %d and second %d numbers are equal", num1, num2);
        }
    }

}
