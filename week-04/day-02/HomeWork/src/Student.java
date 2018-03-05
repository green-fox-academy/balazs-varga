public class Student {

  private String name;
  private int age;
  private String gender;
  private String previousOrganization;
  private int skippedDays;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + " , a " + this.age + " year old " + this.gender + ".");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
}
