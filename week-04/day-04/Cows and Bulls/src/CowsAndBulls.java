import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {

  private int cows;
  private int bulls;
  private int numberToGuess;
  private String playerName;
  private boolean isPlaying;
  private boolean isFinished;
  private int guessNumber;
  private Random random;
  private Scanner scanner;

  public CowsAndBulls() {
    cows = 0;
    bulls = 0;
    random = new Random();
    scanner = new Scanner(System.in);
    numberToGuess = random.nextInt(10000);
    isPlaying = false;
    isFinished = false;
    guessNumber = 0;
  }

  public void gameInit() {
    System.out.println("~~~~ Welcome to the Cows And Bulls game ~~~~");
    System.out.println("Please enter your name: ");
    playerName = scanner.nextLine();
    System.out.println("Hello " + playerName + "! Let's play the game...");
    isPlaying = true;
  }

  public int getCows() {
    return cows;
  }

  public int getBulls() {
    return bulls;
  }

  public int getNumberToGuess() {
    return numberToGuess;
  }

  public static void main(String[] args) {
    CowsAndBulls CAB = new CowsAndBulls();
    CAB.gameInit();
  }
}
