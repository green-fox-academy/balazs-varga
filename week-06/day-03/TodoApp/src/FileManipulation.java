import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

  private final String TODO_PATH_STRING = "../todoFile.txt";
  private final String ID_PATH_STRING = "../id.txt";
  private final String DELIMITER = "%#";
  private List<Todo> todos = new ArrayList<>();
  private List<String> idList = new ArrayList<>();
  private int idCount = 0;

  public List<Todo> readAllDataFromFile() {
    List<String> todosString = new ArrayList<>();

    Path path = Paths.get(TODO_PATH_STRING);
    try {
      todosString.addAll(Files.readAllLines(path));
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      if (Files.readAllLines(path) != null) {
        convertStringToTodoObject(todosString, todos);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return todos;
  }

  public void writeTasksToFile(List<Todo> tasks) {
    Path path = Paths.get(TODO_PATH_STRING);
    List<String> tasksString = new ArrayList<>();

    convertTodoObjectToString(tasks, tasksString);

    try {
      Files.write(path, tasksString);
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }

  public List<String> readIDFromFile() {
    Path path = Paths.get(ID_PATH_STRING);
    File file = new File(ID_PATH_STRING);
    try {
      if (!file.exists()) {
        file.createNewFile();
        idFileInit();
      } else {
        idList.addAll(Files.readAllLines(path));
      }
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
    return idList;
  }

  public void writeIDToFile(List<String> idList) {
    Path path = Paths.get(ID_PATH_STRING);
    try {
      Files.write(path, idList);
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }

  public void idFileInit() {
    Path path = Paths.get(ID_PATH_STRING);
    idList.add("" + idCount);
    try {
      Files.write(path, idList);
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }

  public void convertStringToTodoObject(List<String> todosString, List<Todo> todos) {
    for (int i = 0; i < todosString.size(); i++) {
      String[] stringParts = todosString.get(i).split(DELIMITER);
      Todo newTodo = new Todo(stringParts[1]);
      newTodo.setId(Integer.parseInt(stringParts[0]));
      newTodo.setCreatedAt(LocalDateTime.parse(stringParts[2]));
      newTodo.setCompleted(Boolean.parseBoolean(stringParts[3]));
      if (!stringParts[4].equals("null")) {
        newTodo.setCompletedAt(LocalDateTime.parse(stringParts[4]));
      }
      todos.add(newTodo);
    }
  }

  public void convertTodoObjectToString(List<Todo> tasks, List<String> tasksString) {
    for (int i = 0; i < tasks.size(); i++) {
      tasksString.add(tasks.get(i).getId() + DELIMITER + tasks.get(i).getName() + DELIMITER + tasks.get(i).getCreatedAt() +
              DELIMITER + tasks.get(i).isCompleted() + DELIMITER + tasks.get(i).getCompletedAt());
    }
  }

}
