package Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Exercise_07 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of characters in a given string!

    frequencyOfCharacters("Hello World");
  }

  public static void frequencyOfCharacters(String string) {
    ArrayList<Character> chars = new ArrayList<Character>();
    string = string.replace(" ", "");
    for (char c : string.toCharArray()) {
      chars.add(c);
    }

    System.out.println(chars.stream()
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
