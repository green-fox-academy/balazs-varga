public class Exercise11_Refactorio {

  // Create a recursive function called `refactorio`
  // that returns it's input's factorial

  public static void main(String[] args) {

    System.out.println(refactorio(5));
  }

  public static int refactorio (int inputNumber) {
    if (inputNumber == 0) {
      return 1;
    } else {
      return inputNumber * refactorio(inputNumber - 1);
    }
  }
}
