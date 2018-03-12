public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, String engine, int speed) {
    super(name, engine, speed);
  }

  @Override
  public void takeOff() {
    System.out.println(this.getName() + "is taking off.");
  }

  @Override
  public void fly() {
    System.out.println(this.getName() + "is flying.");
  }

  @Override
  public void land() {
    System.out.println(this.getName() + "is landing.");
  }
}
