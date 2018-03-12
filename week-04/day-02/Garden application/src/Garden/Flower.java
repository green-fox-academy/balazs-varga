package Garden;

public class Flower extends Plant {

  private static final int WATER_LIMIT = 10;

  public Flower(String color) {
    super(color);
    super.setCurrentWaterAmount(0);
    super.setWaterLevel(0);
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
