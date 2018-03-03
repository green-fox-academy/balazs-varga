import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {

  private List<Ship> armadaShips = new ArrayList<Ship>();
  private Random randomNumber = new Random();
  private int armadaCapacity;
  private String armadaName;
  //private int i;

  public Armada(String armadaName) {
    this.armadaName = armadaName;
    //armadaCapacity = randomNumber.nextInt(10) + 3;
  }

  public void addShipToArmada(Ship ship) {
    armadaShips.add(ship);
  }

  public boolean war(Armada otherArmada) {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("The " + this.armadaName + " and " + otherArmada.armadaName + " started to battle with each other");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    int thisArmadaArrayIndex = 0;
    int otherArmadaArrayIndex = 0;
    while (true) {
      if (this.armadaShips.get(thisArmadaArrayIndex).battle(otherArmada.armadaShips.get(otherArmadaArrayIndex))) {
        otherArmadaArrayIndex++;
      } else {
        thisArmadaArrayIndex++;
      }

      if (thisArmadaArrayIndex == this.armadaShips.size()) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The " + this.armadaName + " won the final battle!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return true;
      } else if (otherArmadaArrayIndex == otherArmada.armadaShips.size()) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The " + otherArmada.armadaName + " won the final battle!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return false;
      }
    }
  }

  public String getArmadaName() {
    return armadaName;
  }

  public List<Ship> getArmadaShips() {
    return armadaShips;

  }
}
