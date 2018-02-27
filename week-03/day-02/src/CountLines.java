import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {

  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.

  public static void main(String[] args) {
    String fileName = "countlines.txt";

    countLines(fileName);
  }

  public static int countLines(String fileName) {
    Path path = Paths.get(fileName);
    int lineCount = 0;
    try {
      for (String line:Files.readAllLines(path)){
        System.out.println(line);
        lineCount++;
      }
      System.out.println("The file has " + lineCount + " line(s).");
      return lineCount;
    } catch (IOException e) {
      return 0;
    }
  }
}

