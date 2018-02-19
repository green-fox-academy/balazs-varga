public class Reverse {

    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] temp = new int[5];

        for (int i = 0; i < aj.length; i++) {
            temp[i] = aj[i];
        }
    }
}
