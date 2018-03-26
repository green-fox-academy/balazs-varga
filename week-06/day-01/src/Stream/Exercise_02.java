package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Exercise_02 {

  public static void main(String[] args) {

    //Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    IntSummaryStatistics stats = numbers.stream().filter(n -> n % 2 == 1).mapToInt(n -> n).summaryStatistics();

    double averageOfOddNumbers = stats.getAverage();

    System.out.println("The average of the odd numbers of the numbers list is " + averageOfOddNumbers);
  }
}
