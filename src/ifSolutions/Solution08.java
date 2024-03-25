package ifSolutions;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution compares 2 number and shows the smaller and larger  ");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        if (num1 < num2) {
            System.out.printf("The large value is %d and smaller number is %d", num1, num2);
        } else if (num1 > num2) {
            System.out.printf("The larger value is %d smaller number is %d", num2, num1);
        } else {
            System.out.printf("Both first %d and second %d numbers are equal", num1, num2);
        }
    }

}
