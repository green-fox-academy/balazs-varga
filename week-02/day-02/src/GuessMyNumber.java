import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int lives = 5;

    gameInit(scanner);
    gameRounds(scanner, lives, random);
  }

  public static void gameInit(Scanner scanner) {
    String playerName = "";

    System.out.println("~~~ Guess my number ~~~");

    System.out.print("Please enter your name: ");
    playerName = scanner.next();
    System.out.println();
    System.out.println("Hello " + playerName + ", let's play a game...");
    System.out.println("I've thought about a number, can you guess it?");
    System.out.println();
    System.out.println("I've the number between 1-100. You have 5 lives.");
  }

  public static void gameRounds(Scanner scanner, int lives, Random random) {
    int randomNumber = random.nextInt(100);
    System.out.println("Please provide a number: ");
    int playerNumber = scanner.nextInt();

    while (lives > 0) {
      if (lives == 1 && (playerNumber > randomNumber || playerNumber < randomNumber)) {
        System.out.println();
        System.out.println("~~~ Game Over ~~~");
        System.out.println("~~~ The number was " + randomNumber + " ~~~");
        break;
      } else if (playerNumber > randomNumber) {
        lives--;
        System.out.println("Too high. You have " + lives + " lives left.");
        playerNumber = scanner.nextInt();
      } else if (playerNumber < randomNumber) {
        lives--;
        System.out.println("Too low. You have " + lives + " lives left.");
        playerNumber = scanner.nextInt();
      } else {
        System.out.println();
        System.out.println("~~~ Congratulation, You won the game! ~~~");
        break;
      }
    }
  }
}