public class DiagonalMatrix {

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {
        int[][] diagonalMatrix = new int[4][4];

        for (int row = 0; row < diagonalMatrix.length; row++) {
            for (int column = 0; column < diagonalMatrix[row].length; column++) {
                if (row == column) {
                    diagonalMatrix[row][column] = 1;
                }else {
                    diagonalMatrix[row][column] = 0;
                }
            }
        }

        for (int row = 0; row < diagonalMatrix.length; row++) {
            for (int column = 0; column < diagonalMatrix[row].length; column++) {
                System.out.print(diagonalMatrix[row][column]);
            }
            System.out.println();
        }
    }
}
