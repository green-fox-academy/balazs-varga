package Stream;

public class Exercise_05 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    findUppercaseCharactersLoop("HellO WorlD, What's UP?");
    System.out.println();
    findUppercaseCharactersStream("HellO WorlD, What's UP?");
  }

  //Solution with loops

  public static void findUppercaseCharactersLoop(String string) {
    for (int i = 0; i < string.length(); i++) {
      if (Character.isUpperCase(string.charAt(i))) {
        System.out.println(string.charAt(i));
      }
    }
  }

  //Solution with stream

  public static void findUppercaseCharactersStream(String string) {
    string.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> (char) c)
            .forEach(System.out::println);
  }
}
