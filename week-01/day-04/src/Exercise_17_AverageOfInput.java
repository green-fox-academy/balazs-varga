import java.util.Scanner;

public class Exercise_17_AverageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:

    // Sum: 22, Average: 4.4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide 5 integer numbers: \n");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();
        int fifthNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        double averageOfNumbers = sumOfNumbers / 5;

        System.out.println("\nSum: " + sumOfNumbers + " Average: " + averageOfNumbers);
    }
}
