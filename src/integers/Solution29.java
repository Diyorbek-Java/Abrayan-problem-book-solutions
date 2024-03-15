package integers;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So to use this solution tree inputs are required and the it creates rectangle which "
                + "\nhas side 2(A,B) input A*B");
        System.out.println("And and length C third input");
        System.out.print("Let's start A = ");
        int a = scanner.nextInt();
        System.out.print("And B = ");
        int b = scanner.nextInt();
        System.out.print("And C = ");
        int c = scanner.nextInt();
        int squaresInRow = a / c;
        int squaresInColumn = a / c;
        int totalSquares = squaresInRow * squaresInColumn;
        int unusedArea = a * b - totalSquares * c * c;

        System.out.println("Number of squares placed on the rectangle: " + totalSquares);
        System.out.println("Area of unused part of the rectangle: " + unusedArea);

    }
}
