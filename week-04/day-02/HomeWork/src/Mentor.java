public class Mentor {

  private String name;
  private int age;
  private String gender;
  private String level;

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + " , a " + this.age + " year old " + this.gender + this.level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
