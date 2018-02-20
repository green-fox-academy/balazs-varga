import java.util.*;

public class ElementFinder {
  public static void main(String... args) {
    //ArrayList<Integer> arrayList = (ArrayList)Arrays.asList(1,2,3,4,5);
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(containsSeven(arrayList));
    System.out.println(containsSeven2(arrayList));

    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
  }

  public static String containsSeven(ArrayList arrayList) {
    if (arrayList.contains(7)) {
      return "Hoorray";
    } else {
      return "Noooooo";
    }
  }

  public static String containsSeven2(ArrayList arrayList) {
    int numberCount = 0;

    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i).equals(7)) {
        numberCount++;
      }
    }

    if (numberCount > 0) {
      return "Hoorray";
    } else {
      return "Noooooo";
    }
  }
}
