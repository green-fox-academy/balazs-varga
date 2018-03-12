public abstract class Vehicle {

  private String name;
  private String engine;
  private int speed;

  public Vehicle(String name, String engine, int speed) {
    this.name = name;
    this.engine = engine;
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public String getEngine() {
    return engine;
  }

  public int getSpeed() {
    return speed;
  }
}
