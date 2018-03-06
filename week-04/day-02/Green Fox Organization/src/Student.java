public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this.setName("Jane Doe");
    this.setAge(30);
    this.setGender("female");
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() + " from "
            + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }
}
