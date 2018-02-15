import java.util.Scanner;

public class Exercise_16_AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide how many chickens has the farmer: ");
        int chickens = scanner.nextInt();

        System.out.println("\nPlease provide how many pigs has the farmer: ");
        int pigs = scanner.nextInt();

        int animalLegs = (chickens * 2) + (pigs * 4);

        System.out.println("\nAll the animals have " + animalLegs + " legs.");
    }
}
