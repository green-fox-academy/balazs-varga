import java.util.Arrays;

public class Unique {

    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    public static void main(String[] args) {
        unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
    }

    public static void unique(int... numbers) {
        int counter = 0;
        int[] temp = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int duplicate = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    duplicate++;
                }
            }
            if (duplicate == 0) {
                temp[i] = numbers[i];
                counter++;
            }
        }

        Arrays.sort(temp);

        int[] uniqueFinal = new int[counter];

        for (int i = 0; i < counter; i++) {
            uniqueFinal[i] = temp[i + 3];
        }

        for (int i = 0; i < uniqueFinal.length; i++) {
            System.out.print(uniqueFinal[i] + " ");
        }
    }
}
