import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  public static List<String> ticTacResult(String fileName) {
    Path filePath = Paths.get(fileName);

    List<String> lines = null;

    try {
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Found an error");
    }
    return lines;
  }
}