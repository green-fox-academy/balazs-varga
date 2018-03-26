package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_03 {

  public static void main(String[] args) {

    //Write a Stream Expression to get the squared value of the positive numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    //Solution with loops

    List<Integer> squaredPositiveNumbersLoop = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > 0) {
        squaredPositiveNumbersLoop.add(numbers.get(i) * numbers.get(i));
      }
    }

    System.out.println(squaredPositiveNumbersLoop);

    //Solution with stream

    numbers.stream()
            .filter(n -> n > 0)
            .map(n -> n * n)
            .forEach(System.out::println);

    List<Integer> squaredPositiveNumbersStream = numbers.stream()
            .filter(n -> n > 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
    System.out.println(squaredPositiveNumbersStream);
  }
}
