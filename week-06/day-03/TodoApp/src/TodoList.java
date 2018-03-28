import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TodoList {

  private List<String> tasks;
  private String name;
  private final String PATH_STRING = "../todoFile.txt";
  private int indexToComplete;
  private List<Todo> todos;

  public TodoList(String name) {
    this.name = name;
    tasks = new ArrayList<>();
    todos = new ArrayList<>();
  }

  public List<String> getTasks() {
    return tasks;
  }

  public String getPATH_STRING() {
    return PATH_STRING;
  }

  public void writeTasksToFile(List<Todo> tasks) {
    Path path = Paths.get(PATH_STRING);
    List<String> tasksString = new ArrayList<>();

    for (int i = 0; i < tasks.size(); i++) {
      tasksString.add(tasks.get(i).getId() + "%#" + tasks.get(i).getName() + "%#" + tasks.get(i).getCreatedAt());
    }

    try {
      Files.write(path, tasksString);
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }

  public void listTasks() {
    List<Todo> tasks = readAllDataFromFile();
    if (tasks.size() > 0) {
      for (int i = 0; i < tasks.size(); i++) {
        if (tasks.get(i).getName().startsWith("*") && tasks.get(i).getName().endsWith("*")) {
          String unmarkedString = tasks.get(i).getName().replace("*", "");
          tasks.add(i, new Todo(unmarkedString));
          tasks.remove(i + 1);
          writeTasksToFile(tasks);
          System.out.println((tasks.get(i).getId()) + " - [X] " + tasks.get(i).toString());
        } else {
          System.out.println((tasks.get(i).getId()) + " - [ ] " + tasks.get(i).toString());
        }
      }
    } else {
      System.out.println("No todos for today! :)");
    }
  }

  public void addNewTask(String args, int id) throws IOException {
    List<Todo> tasks = readAllDataFromFile();
    Todo newTodo = new Todo(args);
    newTodo.setId(id);
    newTodo.setCreatedAt(LocalDateTime.now());
    tasks.add(newTodo);
    writeTasksToFile(tasks);
  }

  public void removeTask(String args) {
    List<Todo> tasks = readAllDataFromFile();
    tasks.remove(Integer.parseInt(args) - 1);
    writeTasksToFile(tasks);
  }

  public void completeTask(String args) {
    List<Todo> tasks = readAllDataFromFile();
    indexToComplete = Integer.parseInt(args) - 1;
    if (indexToComplete > tasks.size()) {
      System.out.println("Unable to check: index is out of bound");
      return;
    } else {
      for (int i = 0; i < tasks.size(); i++) {
        if (i == indexToComplete) {
          String markedTask = "*" + tasks.get(i).getName() + "*";
          tasks.add(i, new Todo(markedTask));
          tasks.remove(i + 1);
        }
      }
      writeTasksToFile(tasks);
    }
  }

  private List<Todo> readAllDataFromFile() {
    List<String> todosString = new ArrayList<>();
    List<Todo> todos = new ArrayList<>();

    Path path = Paths.get(PATH_STRING);
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

  private void convertStringToTodoObject(List<String> todosString, List<Todo> todos) {
    for (int i = 0; i < todosString.size(); i++) {
      String[] stringParts = todosString.get(i).split("%#");
      Todo newTodo = new Todo(stringParts[1]);
      newTodo.setId(Integer.parseInt(stringParts[0]));
      newTodo.setCreatedAt(LocalDateTime.parse(stringParts[2]));
      todos.add(newTodo);
    }
  }
}
