package ifSolutions;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  A : ");
        int a = scanner.nextInt();
        System.out.print("Enter B  : ");
        int b = scanner.nextInt();
        if (a > b) {
            b = a;
        } else if (b > a) {
            a = b;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("So if the number were equal their value is set to zero otherwise set larger value for both of them ");
        System.out.printf("So the current values of the A = %d and B = %d", a, b);
    }

}
