package Garden;

public class Tree extends Plants{

  public Tree(String color) {
    super(color);
    super.setCurrentWaterAmount(0);
    super.setWaterLevel(0);
  }

  public void isWaterNeeded() {
    if (getCurrentWaterAmount() < 10) {
      System.out.println("The " + getColor() + " Tree needs water.");
    } else {
      System.out.println("The " + getColor() + " Tree doesn't need water.");
    }
  }
}
