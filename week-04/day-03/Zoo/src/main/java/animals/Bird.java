package main.java.animals;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    super(name);
  }

  public void fly() {
    setSpeed(20);
    System.out.println(getName() + " is flying with " + getSpeed() + " km/h...");
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void takeOff() {
    setSpeed(10);
    System.out.println(getName() + " is taking of with " + getSpeed() + " km/h...");
  }

  @Override
  public void land() {
    setSpeed(0);
    System.out.println(getName() + " is landed");
  }
}
