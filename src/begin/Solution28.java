package begin;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("The aim is to show power ups the value of A");
        System.out.print("Please enter The value of the A: ");
        int a= scanner.nextInt();
        int a2 = a * a;
        int a3 = a2 * a;
        int a5 = a3 * a2;
        int a10 = a5 * a5;
        int a15 = a10 * a5;
        System.out.printf(" so the a = %d\n now Their powers and values,\n A^2= %d , ",a,a2);
        System.out.printf("\n A^3 = %d, \n A^5 = %d,\n A^10 = %d,\n A^15 = %d",a3,a5,a10,a15);
    }
}
