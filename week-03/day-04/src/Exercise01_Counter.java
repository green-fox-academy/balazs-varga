public class Exercise01_Counter {

  // Write a recursive function that takes one parameter: n and counts down from n.

  public static void main(String[] args) {
    System.out.println(counter(15));
  }

  public static int counter (int n) {
      if (n == 0) {
        return 0;
      } else {
        System.out.println(n);
        return counter(n - 1);
      }
  }
}
