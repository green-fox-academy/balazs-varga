package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise_09 {

  public static void main(String[] args) {

    //Write a Stream Expression to convert a char array to a string!

    char[] word = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

    System.out.println(convertToStringLoop(word));

    System.out.println(convertToStringStream(word));
  }

  //Solution with loops

  public static String convertToStringLoop(char[] word) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < word.length; i++) {
      stringBuilder.append(word[i]);
    }

    return stringBuilder.toString();
  }

  //Solution with stream

  public static String convertToStringStream(char[] word) {
    String string = Stream.of(word)
            .map(String::valueOf)
            .collect(Collectors.joining());

    return string;
  }
}
