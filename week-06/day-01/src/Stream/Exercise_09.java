package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise_09 {

  public static void main(String[] args) {

    //Write a Stream Expression to convert a char array to a string!

    char[] word = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

    System.out.println(convertToString(word));
  }

  public static String convertToString(char[] word) {
    List<String> listOfStrings = Stream.of(word)
            .map(String::valueOf)
            .collect(Collectors.toList());

    return listOfStrings.stream()
            .collect(Collectors.joining());
  }
}
