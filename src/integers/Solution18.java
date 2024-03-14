package integers;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The user gives number which bigger than 999 and Solution finds the thousands part of the number");
        System.out.print("Please enter number which bigger than 999 :");
        int number = scanner.nextInt();
        int result = number / 1000;
        System.out.printf("So the digit is %s and the thousands  part of it is equal to %s ", number, result);
    }
}
