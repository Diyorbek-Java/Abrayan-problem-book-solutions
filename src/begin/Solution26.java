package begin;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution puts given value X to find U using this formula y = 4(x−3)^6 − 7(x−3)^3 + 2");
        System.out.print("Please enter the X value: ");
        int x = scanner.nextInt();
        //Formula y = 4(x−3)^6 − 7(x−3)^3 + 2.
        double y = 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;
        System.out.printf("The Y = %s with given value X = %d", y, x);
    }
}
