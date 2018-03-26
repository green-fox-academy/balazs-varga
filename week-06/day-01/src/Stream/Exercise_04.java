package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_04 {

  public static void main(String[] args) {

    //Write a Stream Expression to find which number squared value is more then 20 from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers.stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .forEach(System.out::println);

    List<Integer> result = numbers.stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .collect(Collectors.toList());

    System.out.println(result);
  }
}
