package begin;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution performs changing the values of the variables A,B,C");
        System.out.print("So let's start with A: ");
        int a = scanner.nextInt();
        System.out.print("So let's start with B: ");
        int b = scanner.nextInt();
        System.out.print("So let's start with C: ");
        int c = scanner.nextInt();
        System.out.printf("So the value are like A = %d,B = %d,C = %d\n", a, b, c);
        // A into B
        //B into C
        //C into A
        int temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.printf("So the value changed A = %d,B = %d, C=%d", a, b, c);
    }
}
