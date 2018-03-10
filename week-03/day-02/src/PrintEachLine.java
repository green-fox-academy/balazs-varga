import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class PrintEachLine {
  public static void main(String[] args) {

    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"

    String pathString = "my-file.txt";
    Fi

    try {
        for(String line : Files.readAllLines(path)) {
          System.out.println(line);
        }
    } catch (IOException e) {
      System.out.println("Unable to read file: " + pathString);
    }
  }
}
