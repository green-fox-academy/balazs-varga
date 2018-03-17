import java.util.Random;

public class CowsAndBulls {

  private int cows;
  private int bulls;
  private int numberToGuess;
  private Random random;

  public CowsAndBulls() {
    cows = 0;
    bulls = 0;
    random = new Random();
    numberToGuess = random.nextInt(10000);
  }
}
