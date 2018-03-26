package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Exercise_08 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of numbers in the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    HashMap<Integer, Integer> frequencyOfNumbers = numberOccurrenceCount(numbers);
    System.out.println(frequencyOfNumbers);

    frequencyOfNumbers(numbers);
  }

  //Solution with loops

  public static HashMap<Integer, Integer> numberOccurrenceCount(ArrayList<Integer> numbers) {
    HashMap<Integer, Integer> mapOfNumbers = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      int tempInt = numbers.get(i);
      Integer occurrence = mapOfNumbers.get(tempInt);
      if (occurrence != null) {
        mapOfNumbers.put(tempInt, occurrence + 1);
      } else {
        mapOfNumbers.put(tempInt, 1);
      }
    }
    return mapOfNumbers;
  }

  //Solution with stream

  public static void frequencyOfNumbers(ArrayList<Integer> numbers) {
    System.out.println(numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting())));
  }
}
