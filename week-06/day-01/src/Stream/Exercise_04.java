package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_04 {

  public static void main(String[] args) {

    //Write a Stream Expression to find which number squared value is more then 20 from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    //Solution with loops

    List<Integer> resultLoop = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
      if ((numbers.get(i) * numbers.get(i)) > 20) {
        resultLoop.add(numbers.get(i));
      }
    }

    System.out.println(resultLoop);

    //Solution with stream

    numbers.stream()
            .filter(n -> n * n > 20)
            .forEach(System.out::println);

    List<Integer> resultStream = numbers.stream()
            .filter(n -> n * n > 20)
            .collect(Collectors.toList());

    System.out.println(resultStream);
  }
}
