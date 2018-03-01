public class Exercise09_String3 {

  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".

  public static void main(String[] args) {

    String modifiedString = adjacentCharModifier("aXxnxnxXxutr", 1, "");
    System.out.println(modifiedString);
  }

  public static String adjacentCharModifier(String inputString, int index, String modifiedString) {
    if (index == inputString.length()) {
      return modifiedString;
    } else if (index % 2 == 0) {
      modifiedString += "*";
    } else {
      modifiedString += inputString.charAt(index);
    }
    index++;
    return adjacentCharModifier(inputString, index, modifiedString);
  }
}
