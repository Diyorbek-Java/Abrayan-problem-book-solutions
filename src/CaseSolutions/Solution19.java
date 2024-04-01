package CaseSolutions;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                One of the Asian calendars uses 60-years periods divided into 12-years cycles,
                which are associated with a color: green, red, yellow, white, black.
                Each year in a cycle is connected with some animal: rat, cow, tiger, hare, dragon, snake, horse, sheep, monkey, hen, dog, pig.
                Given some year (as positive integer), output its name provided that 1984 is "The Green Rat`s year
                """);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        String animal = getAnimal(year);
        String color = getColor(year);
        System.out.printf("The year %d is is asean called %s %s's  year", year, color, animal);

    }

    public static String getAnimal(int year) {
        int check = (year - 4) % 12;
        return switch (check) {
            case 0 -> "rat";
            case 1 -> "cow";
            case 2 -> "tiger";
            case 3 -> "hare";
            case 4 -> "dragon";
            case 5 -> "snake";
            case 6 -> "horse";
            case 7 -> "sheep";
            case 8 -> "monkey";
            case 9 -> "hen";
            case 10 -> "dog";
            case 11 -> "pig";
            default -> "Error";
        };
    }

    public static String getColor(int year) {
        int check = (year - 4) % 5;
        return switch (check) {
            case 0 -> "green";
            case 1 -> "red";
            case 2 -> "yellow";
            case 3 -> "white";
            case 4 -> "black";
            default -> "Error";
        };
    }


}
