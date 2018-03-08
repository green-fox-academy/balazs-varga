import java.util.HashMap;

public class CountLetters {

  // Write a function, that takes a string as an argument and returns a dictionary with all letters in the string
  // as keys, and numbers as values that shows how many occurrences there are.

  // Create a test for that.

  private String string;

  public CountLetters(String string) {
    this.string = string;
  }

  public HashMap<Character, Integer> letterOccurrenceCount(String inputString) {
    HashMap<Character, Integer> mapOfLetters = new HashMap<Character, Integer>();
    String stringWithoutSpaces = inputString.replaceAll(" ", "");
    for (int i = 0; i < stringWithoutSpaces.length(); i++) {
      char tempChar = stringWithoutSpaces.charAt(i);
      Integer occurance = mapOfLetters.get(tempChar);
      if (occurance != null) {
        mapOfLetters.put(tempChar, occurance + 1);
      } else {
        mapOfLetters.put(tempChar, 1);
      }
    }
    return mapOfLetters;
  }

  public String getString() {
    return string;
  }
}
