import java.util.Scanner;

public class Exercise_31_DrawSquare {

    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

    public static void main(String[] args) {

        String symbol = "%";
        int innerSymbolPosition = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the number of the square's lines and press Enter:");
        int squareLines = scanner.nextInt();

        for (int i = 0; i < squareLines + 1; i++) {
            if (i == 0 || i == squareLines) {
                for (int j = 0; j < squareLines; j++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }else if (i > 0 && i < squareLines) {
                for (int k = 0; k < squareLines; k++) {
                    if (k == 0 || k == squareLines - 1) {
                        System.out.print(symbol);
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
