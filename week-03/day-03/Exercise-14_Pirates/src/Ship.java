import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> pirates = new ArrayList<Pirate>();
  Random randomNumber = new Random();
  private int shipCapacity = randomNumber.nextInt(10);

  public void fillShip() {
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
