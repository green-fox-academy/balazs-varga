public class Exercise_35_DrawChessTable {

    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //

    public static void main(String[] args) {
        int rowsMax = 8;
        String rowGraphic = "% % % %";

        for (int i = 1; i <= rowsMax; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
                System.out.println(rowGraphic);
            }else {
                System.out.println(rowGraphic);
            }
        }
    }
}
