import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> pirates = new ArrayList<Pirate>();
  private int shipCapacity = 10;

  public void fillShip() {              //kapitányt hozzá kell adni
    while (this.shipCapacity > 0) {
      this.pirates.add(new Pirate());
      this.shipCapacity--;
      if (this.shipCapacity == 0) {
        this.pirates.add(new Pirate(true));
      }
    }
    System.out.println("The ship is filled with pirates and a captain.");
  }

  public List<Pirate> getPirates() {
    return pirates;
  }

  @Override
  public String toString() {
    return "Ship{" +
            "pirates=" + pirates +
            '}';
  }
}
