package integers;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Solution create for finding the hundreds digit of the number");
        System.out.print("Please enter number :");
        int number = scanner.nextInt();
        int result = (number / 100) % 10;
        System.out.printf("So the hundreds digit of the number %d is digit = %d ", number, result);
    }
}
