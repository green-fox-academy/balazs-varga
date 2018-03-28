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
      tasksString.add(tasks.get(i).getId() + "%#" + tasks.get(i).getName() + "%#" + tasks.get(i).getCreatedAt() +
              "%#" + tasks.get(i).isCompleted());
    }

    try {
      Files.write(path, tasksString);
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }

  public void listTasks() {
    List<Todo> todos = readAllDataFromFile();
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

  public void addNewTask(String args, int id) throws IOException {
    List<Todo> todos = readAllDataFromFile();
    Todo newTodo = new Todo(args);
    newTodo.setId(id);
    newTodo.setCreatedAt(LocalDateTime.now());
    todos.add(newTodo);
    writeTasksToFile(todos);
  }

  public void removeTask(String args) {
    List<Todo> todos = readAllDataFromFile();
    todos.remove(Integer.parseInt(args) - 1);
    writeTasksToFile(todos);
  }

  public void completeTask(String args) {
    List<Todo> todos = readAllDataFromFile();
    indexToComplete = Integer.parseInt(args) - 1;
    if (indexToComplete > todos.size()) {
      System.out.println("Unable to check: index is out of bound");
      return;
    } else {
      for (int i = 0; i < todos.size(); i++) {
        if (i == indexToComplete) {
         // String markedTask = "*" + todos.get(i).getName() + "*";
         // todos.add(i, new Todo(markedTask));
         // todos.remove(i + 1);
          todos.get(i).setCompleted(true);
        }
      }
      writeTasksToFile(todos);
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
      newTodo.setCompleted(Boolean.parseBoolean(stringParts[3]));
      todos.add(newTodo);
    }
  }
}
