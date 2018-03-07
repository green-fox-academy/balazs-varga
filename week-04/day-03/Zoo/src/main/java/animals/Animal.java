package main.java.animals;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int legs;
  private String color;
  private int belly;

  public Animal(String name) {
    this.name = name;
  }

  public void eat() {
    belly++;
  }

  public abstract String breed();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
