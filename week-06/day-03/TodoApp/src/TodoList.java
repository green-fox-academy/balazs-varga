import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

  private final String TASK_COMPLETED_SYMBOL = "[X]";
  private final String TASK_INCOMPLETED_SYMBOL = "[ ]";
  private List<String> todosString;
  private String name;
  private List<Todo> todos;
  private int idToComplete;
  private List<String> idList;
  private int idCount = 0;
  private FileManipulation fileManipulation;

  public TodoList(String name) {
    this.name = name;
    todosString = new ArrayList<>();
    fileManipulation = new FileManipulation();
  }

  public void listTasks() {
    todos = fileManipulation.readAllDataFromFile();
    if (todos.size() > 0) {
      for (Todo todo : todos) {
        if (todo.isCompleted()) {
          System.out.println((todo.getId()) + " - " + TASK_COMPLETED_SYMBOL + " " + todo.toString() + " - Task is completed in: "
                  + todo.complitionTime() + " day(s)");
        } else {
          System.out.println((todo.getId()) + " - " + TASK_INCOMPLETED_SYMBOL + " " + todo.toString());
        }
      }
    } else {
      System.out.println("No todos for today! :)");
    }
  }

  public void completeTask(String args) {
    todos = fileManipulation.readAllDataFromFile();
    idToComplete = Integer.parseInt(args);

    List<Integer> ids = new ArrayList<>();

    for (int i = 0; i < todos.size(); i++) {
      ids.add(todos.get(i).getId());
    }

    if (!ids.contains(idToComplete)) {
      System.out.println("Unable to check: the id doesn't exist");
      return;
    } else {

      for (int i = 0; i < todos.size(); i++) {
        if (todos.get(i).getId() == idToComplete) {
          todos.get(i).setCompleted(true);
          todos.get(i).setCompletedAt(LocalDateTime.now());
        }
      }
      fileManipulation.writeTasksToFile(todos);
    }
  }

  public void removeTask(String args) {
    todos = fileManipulation.readAllDataFromFile();
    todos.remove(Integer.parseInt(args) - 1);

    fileManipulation.writeTasksToFile(todos);
  }

  public void addNewTask(String args) {
    todos = fileManipulation.readAllDataFromFile();
    idList = fileManipulation.readIDFromFile();
    idCount = Integer.parseInt(idList.get(0));
    idCount++;
    idList.add(0, "" + idCount);
    fileManipulation.writeIDToFile(idList);

    Todo newTodo = new Todo(args);
    newTodo.setId(idCount);
    newTodo.setCreatedAt(LocalDateTime.now());
    todos.add(newTodo);

    fileManipulation.writeTasksToFile(todos);
  }

  public void updateTask(String idString, String taskName) {
    todos = fileManipulation.readAllDataFromFile();
    int id = Integer.parseInt(idString);

    if (id > todos.size()) {
      System.out.println("Unable to update: index is out of bound");
      return;
    } else {
      for (int i = 0; i < todos.size(); i++) {
        if (todos.get(i).getId() == id) {
          todos.get(i).setName(taskName);
        }
      }
    }
    fileManipulation.writeTasksToFile(todos);
  }

}
