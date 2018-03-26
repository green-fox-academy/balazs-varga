package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Exercise_07 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of characters in a given string!

    HashMap<Character, Integer> letterOccurrence = letterOccurrenceCount("Hello World");
    System.out.println(letterOccurrence);

    frequencyOfCharacters("Hello World");
  }

  //Solution with loops

  public static HashMap<Character, Integer> letterOccurrenceCount(String inputString) {
    HashMap<Character, Integer> mapOfLetters = new HashMap<Character, Integer>();
    String stringWithoutSpaces = inputString.replaceAll(" ", "");
    for (int i = 0; i < stringWithoutSpaces.length(); i++) {
      char tempChar = stringWithoutSpaces.charAt(i);
      Integer occurrence = mapOfLetters.get(tempChar);
      if (occurrence != null) {
        mapOfLetters.put(tempChar, occurrence + 1);
      } else {
        mapOfLetters.put(tempChar, 1);
      }
    }
    return mapOfLetters;
  }

  //Solution with stream

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
