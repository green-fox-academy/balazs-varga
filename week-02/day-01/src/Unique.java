import java.util.Arrays;

public class Unique {

    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    public static void main(String[] args) {
      unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34,});
    }

    public static void unique(int... numbers) {
      int[] unique = new int[numbers.length];
      int uniqueArrayIndex = 0;

      for (int i = 0; i < numbers.length; i++) {
        int temp = numbers[i];
        int counter = 0;

        for (int j = 0; j < numbers.length; j++) {
          if (unique[j] != temp) {
            counter++;
          }
        }
        if (counter == numbers.length) {
          unique[uniqueArrayIndex] = temp;
          uniqueArrayIndex++;
        }
      }

      for (int i = 0; i < unique.length; i++) {
        System.out.println(unique[i]);
      }
    }
}
