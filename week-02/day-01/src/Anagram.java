import java.util.Arrays;

public class Anagram {

  // Create a function named is anagram following your current language's style guide.
  // It should take two strings and return a boolean value depending on whether its an anagram or not.

  public static void main(String[] args) {

    System.out.println(anagram("Tobia Gorrio", "Arrigo Boito"));
  }

  public static boolean anagram(String firstWord, String secondWord) {
    System.out.println("Is the " + firstWord + " anagram of " + secondWord + "?");

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

      if (firstFinalWord.equals(secondFinalWord)) {
        return true;
      } else {
        return false;
      }
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
    String convertedWord = word.toLowerCase().replaceAll(" ", "");
    return convertedWord;

  }
}