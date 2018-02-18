import java.util.Scanner;

public class Exercise_15_MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a distance in kilometers: ");
        int distanceInKilometers = scanner.nextInt();

        double kilometersToMiles = distanceInKilometers * 0.621371192;

        System.out.println("The " + distanceInKilometers + " km is " + (int) kilometersToMiles + " miles.");
    }
}
