import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> pirates = new ArrayList<Pirate>();
  private Random randomNumber = new Random();
  private int shipCapacity;
  private String shipName;

  public Ship(String shipName) {
    shipCapacity = randomNumber.nextInt(15) + 6;
    this.shipName = shipName;
    fillShip();
  }

  public void fillShip() {
    while (shipCapacity > 0) {
      pirates.add(new Pirate());
      shipCapacity--;
      if (shipCapacity == 0) {
        pirates.add(new Pirate(true));
      }
    }
  }

  public void shipInformation() {
    System.out.println("Information about the " + this.shipName + ":");
    System.out.println();
    int alivePirates = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).isCaptain()) {
        System.out.println("\t- The captain's consumed rum level: " + pirates.get(i).getDrunkLevel());
        if (pirates.get(i).isDead()) {
          System.out.println("\t- The captain's state is dead.");
        } else if (pirates.get(i).isSleep()) {
          System.out.println("\t- The captain's state is passed out.");
        } else {
          System.out.println("\t- The captain's state is awake and not drunk.");
        }
      } else if (!pirates.get(i).isDead()) {
        alivePirates++;
      }
    }
    System.out.println("\t- The number of alive pirates: " + alivePirates);
    System.out.println();
  }

  public boolean battle(Ship otherShip) {
    int shipScore = this.calculateBattleScore();
    int otherShipScore = otherShip.calculateBattleScore();

    if (shipScore > otherShipScore) {
      System.out.println("The " + this.shipName + " won the battle!");
      System.out.println();
      this.pirateParty();
      otherShip.shipCrewLossGenerator();
    } else {
      System.out.println("The " + otherShip.shipName + " won the battle!");
      System.out.println();
      otherShip.pirateParty();
      this.shipCrewLossGenerator();
    }
    return shipScore > otherShipScore;
  }

  public int calculateBattleScore() {
    int alivePirates = 0;
    int captainRumLevel = 0;
    int battleScore = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (!(pirates.get(i).isDead())) {
        alivePirates++;
        if (pirates.get(i).isCaptain()) {
          captainRumLevel = pirates.get(i).getDrunkLevel();
        }
      }
    }
    battleScore = alivePirates - captainRumLevel - 1;
    return battleScore;
  }

  public void pirateParty() {
    int randomRumNumber = randomNumber.nextInt(pirates.size()) ;
    for (int i = 0; i < randomRumNumber; i++) {
      pirates.get(i).drinkSomeRum();
    }
  }

  public void shipCrewLossGenerator() {
    int randomLossNumber = randomNumber.nextInt(pirates.size()) + 1;
    for (int i = 0; i < randomLossNumber; i++) {
      pirates.get(i).setDead();
    }
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
