package Stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_06 {

  public static void main(String[] args) {

    //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    //Solution with loops

    for (int i = 0; i < cities.size(); i++) {
      if (cities.get(i).charAt(0) == 'A' && cities.get(i).charAt(cities.get(i).length() - 1) == 'I') {
        System.out.println(cities.get(i));
      }
    }
    
    //Solution with stream

    cities.stream()
            .filter(s -> s.charAt(0) == 'A' && s.charAt(s.length() - 1) == 'I')
            .forEach(System.out::println);
  }
}
