import java.util.Scanner;

public class Exercise_20_PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide two numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The bigger number is: " + firstNumber);
        }else {
            System.out.println("The bigger number is: " + secondNumber);
        }
    }
}
