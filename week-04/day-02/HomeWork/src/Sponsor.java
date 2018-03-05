public class Sponsor {

  private String name;
  private int age;
  private String gender;
  private String company;
  private int hiredStudents;

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + " , a " + this.age + " year old " + this.gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
