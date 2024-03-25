package ifSolutions;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  A : ");
        int a = scanner.nextInt();
        System.out.print("Enter B  : ");
        int b = scanner.nextInt();
        if (a != b) {
            int sum = a + b;
            a = sum;
            b = sum;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("So the argument was assigning the sum values of variables to both if they are not equal other vise to zeo ");
        System.out.printf("So the current values of the A and B are %d", a);
    }

}
