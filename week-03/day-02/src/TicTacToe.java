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

    ticTacResult("win-o.txt");
  }

  public static void ticTacResult(String fileName) {
    Path filePath = Paths.get(fileName);
    int countO = 0;
    int countX = 0;

    try {
      List<String> lines = Files.readAllLines(filePath);

      System.out.println(lines);

      for (int i = 0; i < 3; i++) {

        for (int j = 0; j < 3; j++) {
          System.out.print(lines.get(i).charAt(j));


        }

      }









    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}