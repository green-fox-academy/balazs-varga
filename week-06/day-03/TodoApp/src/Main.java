import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    TodoList todoList = new TodoList("My todo list");

    ArgumentHandler argHandler = new ArgumentHandler(args);

    if (argHandler.noArgs()) {
      argHandler.noArgsPrinter();
    } else if (argHandler.listTasks()) {
      todoList.listTasks();
    } else if (argHandler.addNewTask()) {
      try {
        todoList.addNewTask(args[1]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to add: no task provided");
      }
    } else if (argHandler.removeTask()) {
      try {
        todoList.removeTask(args[1]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to remove: no index provided");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to remove: index is out of bound");
      } catch (NumberFormatException e) {
        System.out.println("Unable to remove: index is not a number");
      }
    } else if (argHandler.completeTask()) {
      try {
        todoList.completeTask(args[1]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to check: no index provided");
      } catch (NumberFormatException e) {
        System.out.println("Unable to check: index is not a number");
      }
    } else {
      System.out.println("Unsupported argument\n");
      argHandler.noArgsPrinter();
    }
  }
}
