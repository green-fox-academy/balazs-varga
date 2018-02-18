import java.util.Scanner;

public class Exercise_33_GuessTheNumber {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = 8;

        System.out.println("Please provide a number: ");

        int userAttempt = scanner.nextInt();

        while(numberToGuess < userAttempt || numberToGuess > userAttempt) {
            if (userAttempt < numberToGuess) {
                System.out.println("The stored number is higher");
                userAttempt = scanner.nextInt();
            }else if (userAttempt > numberToGuess) {
                System.out.println("The stored number is lower");
                userAttempt = scanner.nextInt();
            }
        }

        if (userAttempt == numberToGuess) {
            System.out.println("You found the number: " + numberToGuess);
        }
    }
}
