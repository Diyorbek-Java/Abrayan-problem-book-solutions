package ifSolutions;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution needs three numbers(A,B,C) and if they are ascending order ");
        System.out.println("They are going to be doubled otherwise replace values by their opposites");
        System.out.print("Enter number A : ");
        int a = scanner.nextInt();
        System.out.print("Enter number B : ");
        int b = scanner.nextInt();
        System.out.print("Enter number C : ");
        int c = scanner.nextInt();
        if (a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.printf("Numbers are ascending order so they are doubled %d,%d,%d", a, b, c);
        } else {
            a = -a;
            b = -b;
            c = -c;
            System.out.printf("Numbers are not ascending order so values are %d,%d,%d ", a, b, c);
        }
    }

}
