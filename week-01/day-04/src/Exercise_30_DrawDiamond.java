import java.util.Scanner;

public class Exercise_30_DrawDiamond {

    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    public static void main(String[] args) {
        String symbols = "*";
        int stars = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the number of the triangle's lines and hit Enter:");
        int triangleLines = scanner.nextInt();
        int spaces = triangleLines / 2;

        if (triangleLines % 2 != 0) {
            for (int i = 0; i < ((triangleLines / 2) + 1); i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print(symbols);
                }
                System.out.println();
                stars += 2;
                spaces--;
            }

            spaces += 2;
            stars -= 4;

            for (int i = 0; i < ((triangleLines / 2) + 1); i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print(symbols);
                }
                System.out.println();
                stars -= 2;
                spaces++;
            }
        } else {
            for (int i = 0; i < ((triangleLines / 2)); i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print(symbols);
                }
                System.out.println();
                stars += 2;
                spaces--;
            }

            spaces += 1;
            stars -= 2;

            for (int i = 0; i < ((triangleLines / 2)); i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print(symbols);
                }
                System.out.println();
                stars -= 2;
                spaces++;
            }
        }
    }
}










