package ifSolutions;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution checks the input number and if " +
                "it is negative decreases it for 8 if positive increases by 6 if 0 sets number to 10 ");
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        int temp = number;
        if (number > 0) {
            number -= 8;
            System.out.printf("Given number a = %d is positive so it decreased for 8  a = %d", temp, number);
        } else if (number < 0) {
            number += 6;
            System.out.printf("Given number a = %d is negative  so it is increased for 6 ", number);
        } else {
            number = 10;
            System.out.println("Given  number is equal to 0 so it will be changed to 10");
        }
    }
}
