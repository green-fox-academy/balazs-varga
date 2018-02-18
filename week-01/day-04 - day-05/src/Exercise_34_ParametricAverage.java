import java.util.Scanner;

public class Exercise_34_ParametricAverage {
    // Write a program that asks for a number.
    // It would ask this how many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    public static void main(String[] args) {
        int sum = 0;
        int providedNumber;
        double average = 0;

        System.out.println("How much numbers would you like to add?");
        Scanner scanner = new Scanner(System.in);
        int numberOfIntegers = scanner.nextInt();

        for (int i = 1; i <= numberOfIntegers; i++) {
            System.out.println("Please provide the " + i + ". number");
            providedNumber = scanner.nextInt();
            sum += providedNumber;
        }
        average = sum / numberOfIntegers;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
