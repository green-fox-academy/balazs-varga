public class BattleApp {
  public static void main(String[] args) {

    Ship pirateShip = new Ship("Pirate Ship");
    Ship otherShip = new Ship("Other Ship");

    pirateShip.fillShip();
    otherShip.fillShip();

    pirateShip.shipInformation();
    otherShip.shipInformation();

    pirateShip.battle(otherShip);

    pirateShip.shipInformation();
    otherShip.shipInformation();
  }
}
