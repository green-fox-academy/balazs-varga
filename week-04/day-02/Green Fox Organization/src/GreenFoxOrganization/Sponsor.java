package GreenFoxOrganization;

public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() +
            " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public int hire() {
    return hiredStudents++;
  }
}
