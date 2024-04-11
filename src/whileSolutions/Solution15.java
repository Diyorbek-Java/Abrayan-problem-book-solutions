package whileSolutions;


import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A principal of 1000 euro is invested at a rate of P percent compounded annually.
                A real number P is given, 0 < P < 25. Find, how many years K it will take for an investment to exceed 1100 euro.
                Output K (as an integer) and the compound amount S of the principal at the end of K years (as a real number).
                """);
        System.out.print("Enter number P: ");
        double p = scanner.nextDouble();

        double principal = 1000;
        double targetAmount = 1100;
        int years = 0;
        while (principal < targetAmount) {
            principal *= (1 + p / 100); // Compound annually
            years++;
        }

        System.out.println("Number of years to exceed 1100 euros: " + years);
        System.out.printf("Compound amount at the end of %d years: %.2f euros\n", years, principal);
        scanner.close();
    }
}
