package ifSolutions;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution compares 2 number and shows the larger one ");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();

        System.out.printf("So the numbers are first = %d, second  = %d," +
                " , larger number is %d ", num1, num2, Math.max(num1, num2));
    }

}
