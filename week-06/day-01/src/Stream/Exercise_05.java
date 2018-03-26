package Stream;

public class Exercise_05 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    findUppercaseCharacters("HellO WorlD, What's UP?");
  }

  public static void findUppercaseCharacters(String string) {
    string.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> (char) c)
            .forEach(System.out::println);
  }
}
