import java.util.Arrays;

public class Anagram {

  // Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
  // Create a test for that.

  public boolean isAnagram(String firstWord, String secondWord) {
    if (firstWord.length() != secondWord.length()) {
      return false;
    } else {
      char[] uniqueLettersOfFirstWord;
      char[] uniqueLettersOfSecondWord;

      firstWord = convertWordToLowercaseWithoutSpaces(firstWord);
      secondWord = convertWordToLowercaseWithoutSpaces(secondWord);

      uniqueLettersOfFirstWord = uniqueLettersOfString(firstWord);
      Arrays.sort(uniqueLettersOfFirstWord);

      uniqueLettersOfSecondWord = uniqueLettersOfString(secondWord);
      Arrays.sort(uniqueLettersOfSecondWord);

      String firstFinalWord = String.valueOf(uniqueLettersOfFirstWord);
      String secondFinalWord = String.valueOf(uniqueLettersOfSecondWord);

      return firstFinalWord.equals(secondFinalWord);
    }
  }

  public static char[] uniqueLettersOfString(String word){

    char[] uniqueLettersOfWord = new char[word.length()];
    int uniqueArrayIndex = 0;

    for (int i = 0; i < word.length(); i++) {
      char tempCharacter = word.charAt(i);
      int counter = 0;
      for (int j = 0; j < word.length(); j++) {
        if (uniqueLettersOfWord[j] != tempCharacter) {
          counter++;
        }
      }
      if (counter == word.length()) {
        uniqueLettersOfWord[uniqueArrayIndex] = tempCharacter;
        uniqueArrayIndex++;
      }
    }
    return uniqueLettersOfWord;
  }

  public static String convertWordToLowercaseWithoutSpaces(String word) {
    return word.toLowerCase().replaceAll(" ", "");
  }
}
