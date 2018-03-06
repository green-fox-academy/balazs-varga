package Garden;

public class Tree extends Plants{

  public boolean isTree;

  public Tree(String color) {
    super(color);
    super.setCurrentWaterAmount(0);
    isTree = true;
  }

  public void isWaterNeeded() {
    if (getCurrentWaterAmount() < 10) {
      System.out.println("The " + getColor() + " Tree needs water.");
    } else {
      System.out.println("The " + getColor() + " Tree doesn't need water.");
    }
  }

  public boolean isTree() {
    return isTree;
  }
}
