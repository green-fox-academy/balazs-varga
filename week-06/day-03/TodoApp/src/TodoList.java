import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

  private final String TODO_PATH_STRING = "../todoFile.txt";
  private final String ID_PATH_STRING = "../id.txt";
  private final String DELIMETER = "%#";
  private List<String> todosString;
  private String name;
  private int indexToComplete;
  private List<Todo> todos;
  private List<String> idList;
  private int idCount = 0;

  public TodoList(String name) {
    this.name = name;
    todosString = new ArrayList<>();
    todos = new ArrayList<>();
    idList = new ArrayList<>();
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

  public void listTasks() {
    todos = readAllDataFromFile();
    if (todos.size() > 0) {
      for (int i = 0; i < todos.size(); i++) {
        if (todos.get(i).isCompleted()) {
          System.out.println((todos.get(i).getId()) + " - [X] " + todos.get(i).toString());
        } else {
          System.out.println((todos.get(i).getId()) + " - [ ] " + todos.get(i).toString());
        }
      }
    } else {
      System.out.println("No todos for today! :)");
    }
  }

  public void addNewTask(String args) {
    todos = readAllDataFromFile();
    idList = readIDFromFile();
    idCount = Integer.parseInt(idList.get(0));
    idCount++;
    idList.add(0, "" + idCount);
    writeIDToFile(idList);

    Todo newTodo = new Todo(args);
    newTodo.setId(idCount);
    newTodo.setCreatedAt(LocalDateTime.now());
    todos.add(newTodo);

    writeTasksToFile(todos);
  }

  public void removeTask(String args) {
    todos = readAllDataFromFile();
    todos.remove(Integer.parseInt(args) - 1);

    writeTasksToFile(todos);
  }

  public void completeTask(String args) {
    todos = readAllDataFromFile();
    indexToComplete = Integer.parseInt(args) - 1;
    if (indexToComplete > todos.size()) {
      System.out.println("Unable to check: index is out of bound");
      return;
    } else {
      for (int i = 0; i < todos.size(); i++) {
        if (i == indexToComplete) {
          todos.get(i).setCompleted(true);
          todos.get(i).setCompletedAt(LocalDateTime.now());
        }
      }
      writeTasksToFile(todos);
    }
  }

  private List<Todo> readAllDataFromFile() {
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

  private void convertTodoObjectToString(List<Todo> tasks, List<String> tasksString) {
    for (int i = 0; i < tasks.size(); i++) {
      tasksString.add(tasks.get(i).getId() + DELIMETER + tasks.get(i).getName() + DELIMETER + tasks.get(i).getCreatedAt() +
              DELIMETER + tasks.get(i).isCompleted() + DELIMETER + tasks.get(i).getCompletedAt());
    }
  }

  private void convertStringToTodoObject(List<String> todosString, List<Todo> todos) {
    for (int i = 0; i < todosString.size(); i++) {
      String[] stringParts = todosString.get(i).split(DELIMETER);
      Todo newTodo = new Todo(stringParts[1]);
      newTodo.setId(Integer.parseInt(stringParts[0]));
      newTodo.setCreatedAt(LocalDateTime.parse(stringParts[2]));
      newTodo.setCompleted(Boolean.parseBoolean(stringParts[3]));
      todos.add(newTodo);
    }
  }

  private List<String> readIDFromFile() {
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

  private void idFileInit() {
    Path path = Paths.get(ID_PATH_STRING);
    idList.add("" + idCount);
    try {
      Files.write(path, idList);
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }

  public void updateTask(String firstArg, String secondArg) {
    todos = readAllDataFromFile();
    String updatedTask = secondArg;
    int id = Integer.parseInt(firstArg);

    if (id > todos.size()) {
      System.out.println("Unable to update: index is out of bound");
      return;
    } else {
      for (int i = 0; i < todos.size(); i++) {
        if (todos.get(i).getId() == id) {
          todos.get(i).setName(updatedTask);
        }
      }
    }

    writeTasksToFile(todos);
  }
}
