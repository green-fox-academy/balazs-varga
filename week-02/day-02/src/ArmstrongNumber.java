import java.util.Scanner;

public class ArmstrongNumber {

  // Write a simple program to check if a given number is an armstrong number. The program should ask for a number.
  // E.g. if we type 371, the program should print out: The 371 is an Armstrong number.

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("~~~~~ Armstrong number checker ~~~~~\n");
    System.out.println("Please provide a number:");
    int number = scanner.nextInt();

    isArmstrongNumber(number);
  }

  public static void isArmstrongNumber(int number) {
    int digitsOfNumber = String.valueOf(number).length();
    int sum = 0;
    int[] digits = digitSeparator(number, digitsOfNumber);

    for (int i = 0; i < digits.length; i++) {
      sum += Math.pow(digits[i], digitsOfNumber);
    }

    if (sum == number) {
      System.out.println("\nThe "+ number + " is an Armstrong number.");
    } else {
      System.out.println("\nThe "+ number + " is not an Armstrong number.");
    }
  }

  public static int[] digitSeparator(int number, int digitsOfNumber) {
    int[] digits = new int[digitsOfNumber];

    for (int i = 0; i < digits.length; i++) {
      digits[i] = number % 10;
      number /= 10;
    }
    return digits;
  }
}
