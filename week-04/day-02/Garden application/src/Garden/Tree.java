package Garden;

public class Tree extends Plant {

  private static final int WATER_LIMIT = 10;

  public Tree(String color) {
    super(color);
  }

  public void isWaterNeeded() {
    if (getCurrentWaterAmount() < WATER_LIMIT) {
      System.out.println("The " + getColor() + " Tree needs water.");
    } else {
      System.out.println("The " + getColor() + " Tree doesn't need water.");
    }
  }

  public static int getWaterLimit() {
    return WATER_LIMIT;
  }
}
