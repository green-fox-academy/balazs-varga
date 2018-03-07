package main.java.animals;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int legs;
  private String color;
  private int belly;
  private int speed;

  public Animal(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println(this.name + " is eating.");
    belly++;
  }

  public abstract String breed();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }
}
