import java.util.Scanner;

public class Exercise_28_DrawTriangle {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was

    public static void main(String[] args) {
        String symbols = "*";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the number of the triangle's lines:");
        int triangleLines = scanner.nextInt();

        for (int i = 1; i <= triangleLines; i++) {
            System.out.println(symbols);
            symbols = symbols + '*';
        }
    }
}
