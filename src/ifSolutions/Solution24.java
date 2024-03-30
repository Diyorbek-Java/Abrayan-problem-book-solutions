package ifSolutions;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                                
                Given a real independent variable x, find the value of a real function f defined as:
                        
                f(x) = 2·sin(x), if x > 0,
                 	 	6 − x,  if x ≤ 0.
                 	 	""");
        System.out.print("Enter the x : ");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.printf("The f(%d) is equal to  = %s", x, 2 * Math.sin(x));
        } else {
            System.out.printf("The f(%d) is equal to  = %d", x, 6 - x);
        }
    }
}
