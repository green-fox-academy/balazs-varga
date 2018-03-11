import java.io.IOException;
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

    //System.out.println(ticTacResult("win-o.txt"));
    // should print O

    //System.out.println(ticTacResult("win-x.txt"));
    // should print X

    //System.out.println(ticTacResult("draw.txt"));
    // should print draw

    ticTacToeResult("win-o.txt");
    ticTacToeResult("win-x.txt");
    ticTacToeResult("draw.txt");
  }

  public static void ticTacToeResult(String fileName) {
    Path filePath = Paths.get(fileName);

    try {
      List<String> lines = Files.readAllLines(filePath);
      System.out.println("The " + fileName + " contains the following lines: " + lines);
      ticTacToeWinChecker(lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void ticTacToeWinChecker(List<String> lines) {
    String xLine = "XXX";
    char xChar = 'X';
    String oLine = "OOO";
    char oChar = 'O';

    if (lines.get(0).equals(xLine) || lines.get(1).equals(xLine) || lines.get(2).equals(xLine) ||
            (lines.get(0).charAt(0) == xChar && lines.get(1).charAt(0) == xChar && lines.get(2).charAt(0) == xChar) ||
            (lines.get(0).charAt(1) == xChar && lines.get(1).charAt(1) == xChar && lines.get(2).charAt(1) == xChar) ||
            (lines.get(0).charAt(2) == xChar && lines.get(1).charAt(2) == xChar && lines.get(2).charAt(2) == xChar) ||
            (lines.get(0).charAt(0) == xChar && lines.get(1).charAt(1) == xChar && lines.get(2).charAt(2) == xChar) ||
            (lines.get(0).charAt(2) == xChar && lines.get(1).charAt(1) == xChar && lines.get(2).charAt(0) == xChar)) {
      System.out.println("X win");
    }else if (lines.get(0).equals(oLine) || lines.get(1).equals(oLine) || lines.get(2).equals(oLine) ||
            (lines.get(0).charAt(0) == oChar && lines.get(1).charAt(0) == oChar && lines.get(2).charAt(0) == oChar) ||
            (lines.get(0).charAt(1) == oChar && lines.get(1).charAt(1) == oChar && lines.get(2).charAt(1) == oChar) ||
            (lines.get(0).charAt(2) == oChar && lines.get(1).charAt(2) == oChar && lines.get(2).charAt(2) == oChar) ||
            (lines.get(0).charAt(0) == oChar && lines.get(1).charAt(1) == oChar && lines.get(2).charAt(2) == oChar) ||
            (lines.get(0).charAt(2) == oChar && lines.get(1).charAt(1) == oChar && lines.get(2).charAt(0) == oChar)) {
      System.out.println("O win");
    }else {
      System.out.println("draw");
    }
  }
}