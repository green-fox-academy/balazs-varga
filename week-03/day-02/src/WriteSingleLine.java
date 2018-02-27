import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteSingleLine {
  public static void main(String[] args) {

    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    String pathString = "my-file_writeSingleLine.txt";
    writeSinleLine(pathString);
  }

  public static void writeSinleLine(String pathString) {
    ArrayList<String> myName = new ArrayList<>(Arrays.asList("Balazs Varga"));
    Path path = Paths.get(pathString);

    try {
      Files.write(path, myName);
    } catch (Exception e) {
      System.out.println("Unable to write file: " + pathString);
    }
  }
}