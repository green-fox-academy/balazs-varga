package Garden;

public class Plants extends Garden{

  private double currentWaterAmount;
  private String color;
  private double waterLevel;


  public Plants(String color) {
    this.color = color;
    currentWaterAmount = 0;
    waterLevel = 0;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(double currentWaterAmount) {
    this.currentWaterAmount += currentWaterAmount;
  }

  public String getColor() {
    return color;
  }

  public void setWaterLevel(int waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getWaterLevel() {
    return waterLevel;
  }
}
