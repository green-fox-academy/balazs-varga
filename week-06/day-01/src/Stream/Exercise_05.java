package Stream;

import java.util.stream.Stream;

public class Exercise_05 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    findUppercaseCharacters("Hello World, What's Up?");
  }

  public static void findUppercaseCharacters(String word) {
    Stream.of(word.split(" "))
            .filter(s -> s.charAt(0) >= 65 && s.charAt(0) <= 90)
            .map(s -> s.charAt(0))
            .forEach(System.out::println);
  }
}
