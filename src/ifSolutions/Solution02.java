package ifSolutions;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution checks the input number and if " +
                "it is negative decreases it for 8 otherwise increases it by 6");
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        int temp = number;
        if (number > 0) {
            number -= 8;
            System.out.printf("Given number a = %d is positive so it decreased for 8  a = %d", temp, number);
        } else {
            number += 6;
            System.out.printf("Given number a = %d is negative or zero so it is increased for 6 ", number);
        }
    }
}
