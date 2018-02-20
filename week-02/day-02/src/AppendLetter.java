import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");

    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static List<String> appendA(List<String> listToAppend) {
    char appendChar = 'a';

    for (int i = 0; i < listToAppend.size(); i++) {
      listToAppend.set(i, listToAppend.get(i) + appendChar);
    }
    return listToAppend;
  }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"