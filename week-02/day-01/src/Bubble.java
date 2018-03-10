import java.util.Arrays;

public class Bubble {

  public static void main(String[] args) {

    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `True` sort that list descending

    //  Example:
    //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]

    int[] numbers = {34, 12, 24, 9, 5};

    System.out.println(Arrays.toString(bubble(numbers)));
    System.out.println(Arrays.toString(advancedBubble(numbers, true)));
  }

  public static int[] bubble(int[] numbers) {
    int temp = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 1; j < numbers.length; j++) {
        if (numbers[j - 1] > numbers[j]) {
          temp = numbers[j - 1];
          numbers[j - 1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    return numbers;
  }

  public static int[] advancedBubble(int[] numbers, boolean isAdvanced) {
    int[] descendingNumbers = new int[numbers.length];
    int index = 0;

    if (isAdvanced) {
      int[] sortedNumbers = bubble(numbers);
      for (int i = sortedNumbers.length - 1; i >= 0; i--) {
        descendingNumbers[index] = sortedNumbers[i];
        index++;
      }
    }
    return descendingNumbers;
  }
}
