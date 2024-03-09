package begin;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Solution is for turning radian in degree");
        System.out.print("Please enter radian A: ");
        double radian = scanner.nextDouble();
        double degree = (radian/3.14)*180;
        System.out.printf("Degree value of the given radian = %s, is %s", radian,degree);
    }
}
