public class Reverse {

    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] temp = new int[5];
        int index;

        for (int i = 0; i < aj.length; i++) {
            temp[i] = aj[i];
        }
        
        index = aj.length;

        for (int i = 0; i < aj.length; i++) {
            aj[i] = temp[index - 1];
            index--;
        }

        for (int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }
    }
}
