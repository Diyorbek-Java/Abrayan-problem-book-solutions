package ifSolutions;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a real independent variable x, find the value of an integer function f defined as:
                                
                 	 	0,	if x < 0,
                f(x)	 = 	1,	if x belongs to [0, 1), [2, 3), …,
                 	 	−1,	if x belongs to [1, 2), [3, 4), … .
                """);
        System.out.print("Enter the x : ");
        double x = scanner.nextDouble();
        if (x < 0) {
            System.out.printf("The f(%s) is equal to  = 0", x);
        } else if ((int)x % 2 == 0) {
            System.out.printf("The f(%s) is equal to  = -1", x);
        } else {
            System.out.printf("The f(%s) is equal to  = 1", x);
        }
    }
}
