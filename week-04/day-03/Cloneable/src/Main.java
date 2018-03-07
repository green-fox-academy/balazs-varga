public class Main {

  //Check out what the Cloneable (java) or ICloneable (.aspx) interface is
  //Get your Student class from the Greenfox Organization Exercise
  // Make the Student implement the Cloneable interface
  // Implement the method, so it clones the student
  // Instantiate John, a 20 years old male from BME
  // Clone him

  public static void main(String[] args) throws CloneNotSupportedException {

    Student john = new Student("John", 20, "female", "BME");
    Student johnClone = (Student) john.clone();

    System.out.println(john.toString());
    System.out.println(johnClone.toString());
  }
}
