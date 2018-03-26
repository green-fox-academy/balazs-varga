package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise_08 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of numbers in the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    frequencyOfNumbers(numbers);
  }

  public static void frequencyOfNumbers(ArrayList<Integer> numbers) {
    System.out.println(numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting())));
  }
}
