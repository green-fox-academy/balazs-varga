import java.util.Scanner;

public class Exercise_29_DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    public static void main(String[] args) {
        String symbols = "*";
        int stars = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the number of the triangle's lines:");
        int triangleLines = scanner.nextInt();
        int spaces = triangleLines-1;

        for (int i = 0; i < triangleLines; i++) {
            for (int x = 0; x < spaces; x++){
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(symbols);
            }
            System.out.println();
            stars += 2;
            spaces--;
        }
    }
}

