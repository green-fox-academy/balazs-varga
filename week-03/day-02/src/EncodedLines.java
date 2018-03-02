import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class EncodedLines {
  public static void main(String[] args) {
    String pathName = "encoded-lines.txt";
    decoder(pathName);
  }

  public static void decoder(String pathName) {
    try {
      Path path1 = Paths.get(pathName);
      Path path2 = Paths.get("decrypted.txt");

      List<String> encryptedMessage = Files.readAllLines(path1);
      List<String> decryptedMessage = new ArrayList<String>();

      for(int i = 0; i < encryptedMessage.size(); i++) {
        String encryptedLine = encryptedMessage.get(i);
        String decryptedLine = cypher(encryptedLine);
        decryptedMessage.add(decryptedLine);
      }

      Files.write(path2, decryptedMessage);
      System.out.print("Message decrypted!");
    } catch (Exception e) {
      System.out.print(e);
    }
  }

  public static String cypher(String aString) {
    StringBuilder decryptedMessage = new StringBuilder(aString);
    for(int i = 0; i < decryptedMessage.length(); i++) {
      if(decryptedMessage.charAt(i) == ' '){
        decryptedMessage.setCharAt(i, ' ');
      } else {
        char key = decryptedMessage.charAt(i);
        int k = (int) key - 1;
        char keyX = (char) k;
        decryptedMessage.setCharAt(i, keyX);
      }
    }
    String result = decryptedMessage.toString();
    return result;
  }
}