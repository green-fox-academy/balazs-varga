import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Logs {

  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP addresses.
  // Write a function that returns the GET / POST request ratio.

  public static void main(String[] args) {

    String pathString = "log.txt";

    uniqueIP(pathString);
    System.out.println(postGetRatio(pathString));
  }

  public static Set<String> uniqueIP(String fileName) {
    Path path = Paths.get(fileName);
    ArrayList<String> ipAddresses = new ArrayList<>();
    ArrayList<String> lines = new ArrayList<>();
           // Files.readAllLines(path);

    try {
      for (String line : Files.readAllLines(path)) {
        lines.add(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: " + fileName);
    }

    for (int i = 0; i < lines.size(); i++) {
      ipAddresses.add(i, lines.get(i).subSequence(25, 41).toString());
    }

    Set<String> uniqueIP = new HashSet<String>(lines);    //unique values

    return uniqueIP;
  }

  public static double postGetRatio(String fileName) {
    Path path = Paths.get(fileName);
    double postCounter = 0;
    double getCounter = 0;
    ArrayList<String> lines = new ArrayList<>();

    try {
      for (String line : Files.readAllLines(path)) {
        lines.add(line);
        }
      }catch (IOException e) {
        e.printStackTrace();
    }

    for (int i = 0; i < lines.size(); i++) {
      if(lines.get(i).contains("POST")) {
        postCounter++;
      } else {
        getCounter++;
      }
    }
    return getCounter / postCounter;
  }
}


