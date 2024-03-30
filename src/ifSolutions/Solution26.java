package ifSolutions;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a real independent variable x, find the value of a real function f defined as:
                              
                 	 	−x,	if x ≤ 0,
                f(x)	 = 	x2,	if 0 < x < 2,
                 	 	4,	if x ≥ 2.
                                
                """);
        System.out.print("Enter the x : ");
        double x = scanner.nextDouble();
        if (x <= 0) {
            System.out.printf("The f(%s) is equal to  = %s", x, -x);
        } else if (x < 2) {
            System.out.printf("The f(%s) is equal to  = %s", x, x * x);
        } else {
            System.out.printf("The f(%s) is equal to  = 4", x);
        }
    }
}
