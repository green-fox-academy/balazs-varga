package Garden;

public class Flower extends Plants{

  public Flower(String color) {
    super(color);
    super.setCurrentWaterAmount(0);
    super.setWaterLevel(0);
  }

  public void isWaterNeeded() {
    if (getCurrentWaterAmount() < 5) {
      System.out.println("The " + getColor() + " Flower needs water.");
    } else {
      System.out.println("The " + getColor() + " Flower doesn't need water.");
    }
  }
}
