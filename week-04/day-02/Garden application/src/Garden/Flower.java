package Garden;

public class Flower extends Plant {

  private static final int WATER_LIMIT = 5;

  public Flower(String color) {
    super(color);
  }

  public void isWaterNeeded() {
    if (getCurrentWaterAmount() < WATER_LIMIT) {
      System.out.println("The " + getColor() + " Flower needs water.");
    } else {
      System.out.println("The " + getColor() + " Flower doesn't need water.");
    }
  }

  public static int getWaterLimit() {
    return WATER_LIMIT;
  }
}
