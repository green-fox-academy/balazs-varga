import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    reversedOrderDecryptor("reversed-order.txt");
  }

  public static void reversedOrderDecryptor(String fileName) {
    Path filePath = Paths.get(fileName);

    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = lines.size() - 1; i >= 0; i--) {
        System.out.println(lines.get(i));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}