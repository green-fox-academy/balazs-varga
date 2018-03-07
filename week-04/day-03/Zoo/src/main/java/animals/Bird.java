package main.java.animals;

public class Bird extends Animal {

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
}
