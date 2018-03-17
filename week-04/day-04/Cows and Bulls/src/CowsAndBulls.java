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
  private int rounds;
  private Random random;
  private Scanner scanner;

  public CowsAndBulls() {
    cows = 0;
    bulls = 0;
    random = new Random();
    scanner = new Scanner(System.in);
    numberToGuess = random.nextInt(9000) + 1000;
    isPlaying = false;
    isFinished = false;
    guessNumber = 0;
    rounds = 10;
  }

  public void gameInit() {
    System.out.println("~~~~ Welcome to the Cows And Bulls game ~~~~");
    System.out.print("\nPlease enter your name: ");
    playerName = scanner.nextLine();
    System.out.println("\nHello " + playerName + "!");
    System.out.println("Please give a 4 digit number and press ENTER, you have " + rounds + " attempts to guess it. Have fun :)");
    isPlaying = true;
  }

  public void game() {
    while (rounds != 0) {
      cows = 0;
      bulls = 0;

      System.out.println(guess());

      if (isPlayerWon(cows)) {
        break;
      } else {
        rounds--;
      }

      isGameOver(rounds);
    }
  }

  public boolean isPlayerWon(int cows) {
    if (cows == 4) {
      System.out.println("\n~~~~ YOU WON THE GAME ~~~~");
      isPlaying = false;
      isFinished = true;
      return true;
    } else {
      return false;
    }
  }

  public boolean isGameOver(int rounds) {
    if (rounds == 0) {
      isPlaying = false;
      isFinished = true;
      System.out.println("\n~~~~ GAME OVER ~~~~");
      return true;
    } else {
      return false;
    }
  }

  public String guess() {
    int playerGuess = scanner.nextInt();
    String numberToGuessString = "" + numberToGuess;
    String playerGuessString = "";
    guessNumber++;

    while (playerGuess > 10000 || playerGuess < 1000) {
      System.out.println("Please give a 4 digit number.");
      playerGuess = scanner.nextInt();
    }

    playerGuessString = "" + playerGuess;

    for (int i = 0; i < 4; i++) {
      if (playerGuessString.charAt(i) == numberToGuessString.charAt(i)) {
        cows++;
      } else if (numberToGuessString.contains("" + playerGuessString.charAt(i))) {
        bulls++;
      }
    }

    return "Cows: " + cows + "   Bulls: " + bulls + "   Your number: " + playerGuess + " - You left " + (rounds - 1) + " tries.";
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
    CAB.game();
  }
}
