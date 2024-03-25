package ifSolutions;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution compares 2 number(A,B) and shows the smaller and larger once and ");
        System.out.println("Redistributes the values so that A and B have the smaller and the larger value respectively");
        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter second number : ");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.printf("The large value is %d and smaller number is %d values are not changed", a, b);
        } else if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.printf("The larger value is %d smaller number is %d values are changed", a, b);
        } else {
            System.out.printf("Both first %d and second %d numbers are equal", a, b);
        }
    }

}
