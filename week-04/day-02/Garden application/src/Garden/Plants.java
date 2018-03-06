package Garden;

import java.util.List;

public class Plants extends Garden{

  private int currentWaterAmount;
  private String color;

  public Plants(String color) {
    this.color = color;
    currentWaterAmount = 0;
  }

  public void isWaterNeeded() {
    if (currentWaterAmount < 0) {
      System.out.println("The plant needs water");
    }
  }

  public int getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
