import java.util.ArrayList;
import java.util.List;

public class SubInt {

  //  Create a function that takes a number and a list of numbers as a parameter
  //  Returns the indexes of the numbers in the list where the first number is part of
  //  Returns an empty list if the number is not part any of the numbers in the list

  //  Example:
  //  System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
  //  should print: `[0, 1, 4]`
  //  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
  //  should print: '[]'

  public static void main(String[] args) {
    subInt(1, new int[] {1, 11, 34, 52, 61});
    subInt(3, new int[] {1, 11, 34, 52, 61});

    System.out.println(3 % 10);
  }

  public static void subInt(int subInt, int[] numbers) {
    List<Integer> indexesOfSubInts = new ArrayList<>();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 10 == subInt || numbers[i] / 10 % 10 == subInt || numbers[i] / 100 % 100 == subInt) {
        indexesOfSubInts.add(i);
      }
    }
    System.out.println(indexesOfSubInts.toString());
  }
}
