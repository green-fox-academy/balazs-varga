import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {
    String fileFromCopy = "copy_from.txt";
    String fileToCopy = "copy_to.txt";

    System.out.println(copyFile(fileFromCopy, fileToCopy));
  }

  public static boolean copyFile(String fileCopyFrom, String fileCopyTo) {
    Path path1 = Paths.get(fileCopyFrom);
    Path path2 = Paths.get(fileCopyTo);

    try {
      Files.copy(path1, path2);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
