public class Exercise08_String2 {

  // Given a string, compute recursively a new string where all the 'x' chars have been removed.

  public static void main(String[] args) {

    String modifiedString = xRemover("aXxnxnxXxutr", 0, "");
    System.out.println(modifiedString);
  }

  public static String xRemover(String inputString, int index, String modifiedString) {
    if (index == inputString.length()) {
      return modifiedString;
    } else if (inputString.charAt(index) == 'x') {
      modifiedString += "";
    } else {
      modifiedString += inputString.charAt(index);
    }
    index++;
    return xRemover(inputString, index, modifiedString);
  }
}