import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> pirates = new ArrayList<Pirate>();
  Random randomNumber = new Random();
  private int shipCapacity = randomNumber.nextInt(10);

  public void fillShip() {
    while (shipCapacity > 0) {
      pirates.add(new Pirate());
      shipCapacity--;
      if (shipCapacity == 0) {
        pirates.add(new Pirate(true));
      }
    }
    System.out.println("The ship is filled with pirates and a captain.");
    System.out.println();
  }

  public void shipInformation() {
    int alivePirates = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).isCaptain()) {
        System.out.println("The captain's consumed rum level: " + pirates.get(i).getDrunkLevel());
        if (pirates.get(i).isDead()) {
          System.out.println("The captain's state is dead.");
        } else if (pirates.get(i).isSleep()) {
          System.out.println("The captain's state is passed out.");
        } else {
          System.out.println("The captain's state is awake and not drunk.");
        }
      } else if (!pirates.get(i).isDead()) {
        alivePirates++;
      }
    }
    System.out.println("The number of alive pirates: " + alivePirates);
  }

  public void battle(Ship otherShip) {

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
