public class Exercise02_NumberAdder {

  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

  public static void main(String[] args) {
    System.out.println(numberAdder(4));
  }

  public static int numberAdder (int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + numberAdder(n - 1);
    }
  }
}
