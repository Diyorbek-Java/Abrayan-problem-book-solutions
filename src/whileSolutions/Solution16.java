package whileSolutions;


import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                The skier began trainings having run 10 km. Each next day he increased the run
                distance by P percent from the distance of the last day. A real number P is given, 0 < P < 50).
                Find, how many days K it will take for a total run to exceed 200 km. Output K (as an integer) and the total run S (as a real number).
                """);
        System.out.print("Enter number P(0 < P < 50): ");
        double p = scanner.nextDouble();
        double start = 10;
        int k = 1;
        while (start <= 200) {
            start += start * (p / 100);
            k++;
        }
        System.out.println("number of days that distance exceed 200 km is K = " + k);
        System.out.printf("After K = %d distance will be %s", k, start);
        scanner.close();
    }
}
