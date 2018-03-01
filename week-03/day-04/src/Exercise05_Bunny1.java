public class Exercise05_Bunny1 {

  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

  public static void main(String[] args) {

    System.out.println(bunnyEarsCount(3));
  }

  public static int bunnyEarsCount(int bunnyNumber) {
    int bunnyEars = 2;
    if (bunnyNumber == 1) {
      return 2;
    } else {
      return bunnyEars + bunnyEarsCount(bunnyNumber - 1);
    }
  }
}
