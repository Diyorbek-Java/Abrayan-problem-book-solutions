package begin;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution works for exchanging values of two given values");
        System.out.print("Insert value A : ");
        double a = scanner.nextDouble();
        System.out.print("Insert value B : ");
        double b = scanner.nextDouble();
        System.out.printf("So now the values are  A = %s and B =%s", a, b);
        double temp = a;
        a = b;
        b = temp;
        System.out.printf("Now the values are changed A = %s and B = %s ", a, b);
    }
}
