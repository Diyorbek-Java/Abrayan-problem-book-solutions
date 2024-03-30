package ifSolutions;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer independent variable x, find the value of an integer function f defined as:
                                    
                f(x) = 2·x, if x < −2 or x > 2,
                 	 	−3·x otherwise.
                                    
                 	 	""");
        System.out.print("Enter the x : ");
        int x = scanner.nextInt();
        if (x < -2 || x > 2) {
            System.out.printf("The f(%d) is equal to  = %s", x, 2 * x);
        } else {
            System.out.printf("The f(%d) is equal to  = %s", x, -3 * x);
        }
    }
}
