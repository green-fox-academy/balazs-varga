import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    duplicatedCharDecrypter("duplicated-chars.txt");
  }

  public static void duplicatedCharDecrypter(String fileName) {
    Path filePath = Paths.get(fileName);
    int charIndex;

    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        charIndex = 0;
        for (int j = 0; j < line.length() / 2; j++) {
          System.out.print(line.charAt(charIndex));
          charIndex += 2;
        }
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
