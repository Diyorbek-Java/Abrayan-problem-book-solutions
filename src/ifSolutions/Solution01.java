package ifSolutions;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution checks the input number and if " +
                "it is negative decreases it for 8 otherwise  nothing put shows input");
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        int temp = number;
        if (number > 0) {
            number -= 8;
            System.out.printf("Given number a = %d is positive so it decreased for 8  a = %d", temp, number);
        } else {
            System.out.printf("Given number a = %d is negative or zero so it will not changes", number);
        }
    }
}
