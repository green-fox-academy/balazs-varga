package animals;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int legs;
  private String color;

  public abstract void breed();

  public String getName() {
    return name;
  }
}
