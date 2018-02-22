public class PalindromeBuilder {

  public static void main(String[] args) {
    System.out.println(palindromeBuilder("greenfox"));
    System.out.println(palindromeBuilder("123"));
  }

  public static String palindromeBuilder(String word) {
    char[] reverseOfWord = new char[word.length()];
    String palindromeOfWord = "";
    int index = 0;

    for (int i = word.length() - 1; i >= 0; i--) {
      char temp = word.charAt(i);
      reverseOfWord[index] = temp;
      index++;
    }

    palindromeOfWord = String.valueOf(reverseOfWord);

    return word + palindromeOfWord;
  }
}
