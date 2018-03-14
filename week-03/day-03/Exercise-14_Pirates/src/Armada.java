import java.util.ArrayList;
import java.util.List;

public class Armada {

  private List<Ship> armadaShips = new ArrayList<>();
  private String armadaName;

  public Armada(String armadaName) {
    this.armadaName = armadaName;
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
}
