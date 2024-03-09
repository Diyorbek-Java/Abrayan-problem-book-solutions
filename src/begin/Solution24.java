package begin;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution changes the given tree values into another once");
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        System.out.print("Enter C: ");
        int c = scanner.nextInt();
        System.out.printf("So the value were like A = %d,B = %d, C = %d\n", a, b, c);
        /*
         A into C
         C into B
         B into A
        */
        int temp = c;
        c = a;
        a = b;
        b = temp;
        System.out.printf("Answer values are A = %d,B = %d,C = %d", a, b, c);


    }
}
