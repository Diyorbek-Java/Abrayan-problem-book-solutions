package begin;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This solution computes the multiplication operation for given A");
        System.out.print("Enter value of the A: ");
        int a = scanner.nextInt();

        int a2 = a * a;
        int a4 = a2 * a2;
        int a8 = a4 * a4;
        System.out.printf("So given value a was %d, values now\n A^2 = %d,\n A^4 = %d,\n A^8 = %d", a, a2, a4, a8);
    }

}
