public class ArgumentHandler {

  private String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public boolean noArgs() {
    return args.length == 0;
  }

  public void noArgsPrinter() {
    System.out.println("Command Line Todo application\n" + "=============================\n\n" +
            "Command line arguments:\n" + " -l   Lists all the tasks\n" + " -a   Adds a new task\n" +
            " -u   Update a task\n" + " -r   Removes a task\n" + " -c   Completes a task\n"
    );
  }

  public boolean listTasks() {
    return args[0].equals("-l");
  }

  public boolean addNewTask() {
    return args[0].equals("-a");
  }

  public boolean updateTask() {
    return args[0].equals("-u");
  }

  public boolean removeTask() {
    return args[0].equals("-r");
  }

  public boolean completeTask() {
    return args[0].equals("-c");
  }
}
