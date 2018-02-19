public class Factorial {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void main(String[] args) {
        System.out.println(factorio(5));
    }

    public static int factorio(int number) {
        int factorial = number;

        for (int i = number - 1; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
