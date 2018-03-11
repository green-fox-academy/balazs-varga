import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt

    reversedLinesDecrypter("reversed-lines.txt");
  }

  public static void reversedLinesDecrypter(String fileName) {
    Path filePath = Paths.get(fileName);

    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line:lines) {
        for (int i = 0; i < line.length(); i++) {
          System.out.print(line.charAt(line.length() - 1 - i));
        }
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}