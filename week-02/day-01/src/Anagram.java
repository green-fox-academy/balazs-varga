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

      uniqueLettersOfFirstWord = findUniqueLettersOfString(firstWord);
      Arrays.sort(uniqueLettersOfFirstWord);
      charArrayPrinter(uniqueLettersOfFirstWord);

      uniqueLettersOfSecondWord = findUniqueLettersOfString(secondWord);
      Arrays.sort(uniqueLettersOfSecondWord);
      charArrayPrinter(uniqueLettersOfSecondWord);

      String temp1 = String.valueOf(uniqueLettersOfFirstWord);
      String temp2 = String.valueOf(uniqueLettersOfSecondWord);

      if (temp1.equals(temp2)) {
        return true;
      } else {
        return false;
      }
    }
  }

  public static char[] findUniqueLettersOfString(String word){

    char[] uniqueLettersOfWord = new char[word.length()];
    int uniqueArrayIndex = 0;

    for (int i = 0; i < word.length(); i++) {
      char temp = word.charAt(i);
      int counter = 0;
      for (int j = 0; j < word.length(); j++) {
        if (uniqueLettersOfWord[j] != temp) {
          counter++;
        }
      }
      if (counter == word.length()) {
        uniqueLettersOfWord[uniqueArrayIndex] = temp;
        uniqueArrayIndex++;
      }
    }
    return uniqueLettersOfWord;
  }

  public static String convertWordToLowercaseWithoutSpaces(String word) {
    String modifiedWord = word.toLowerCase().replaceAll(" ", "");
    return modifiedWord;
  }

  public static void charArrayPrinter(char[] arrayToPrint) {
    for (int i = 0; i < arrayToPrint.length; i++) {
      System.out.print(arrayToPrint[i]);
    }
    System.out.println();
  }
}
