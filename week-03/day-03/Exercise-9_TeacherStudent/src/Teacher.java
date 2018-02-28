public class Teacher {

  public void answer() {
    System.out.println("This is the answer method of the Teacher class");
  }

  public void teach(Student student) {
    student.learn();
  }
}
