public class Exercise06_Bunny2 {

  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
  // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

  public static void main(String[] args) {

    System.out.println(bunnyEarsCount(3));
  }

  public static int bunnyEarsCount(int bunnyLines) {
    int oddBunnyEars = 2;
    int evenBunnyEars = 3;
    int bunnyEars;
    if (bunnyLines == 1) {
      return 2;
    } else {
      if (bunnyLines % 2 == 0) {
        bunnyEars = evenBunnyEars;
      } else {
        bunnyEars = oddBunnyEars;
      }
      return bunnyEars + bunnyEarsCount(bunnyLines - 1);
    }
  }
}
