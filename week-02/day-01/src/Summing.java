public class Summing {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
    }

    public static int sum(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        return sum;
    }
}
