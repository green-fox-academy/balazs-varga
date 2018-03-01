public class Exercise09_String3 {

  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".

  public static void main(String[] args) {

    String modifiedString = adjacentCharModifier("aXxnxnxXxutr", 0, "");
    System.out.println(modifiedString);
  }

  public static String adjacentCharModifier(String inputString, int index, String modifiedString) {

    if (index == inputString.length()) {
      return modifiedString;
    } else if (index == inputString.length() - 1) {
      modifiedString += inputString.charAt(index);
    } else {
      modifiedString += inputString.charAt(index) + "*";
    }
    index++;
    return adjacentCharModifier(inputString, index, modifiedString);
  }
}
