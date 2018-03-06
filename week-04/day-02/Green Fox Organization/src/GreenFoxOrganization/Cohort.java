package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort extends Person {

  private String name;
  private List<Student> students = new ArrayList<>();
  private List<Mentor> mentors = new ArrayList<>();

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + this.name + " cohort has " + students.size() + " students and "
            + mentors.size() + " mentors.");
  }
}
