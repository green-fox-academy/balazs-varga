import java.util.Scanner;

public class DivideByZero {

  // Create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // It should print "fail" if the parameter is 0

  public static void main(String[] args) {
    try {
      divideByTen(5);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }

  public static void divideByTen(int inputNumber) {
    int result = 10 / inputNumber;
    System.out.println("The result is: " + result);
  }
}
