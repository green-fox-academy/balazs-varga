public class Printer {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourh")
    // ...

    public static void main(String[] args) {
        printer("first", "second", "third", "fourth");
    }

    public static void printer(String... words) {
        if (words.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
