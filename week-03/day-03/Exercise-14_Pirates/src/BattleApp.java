public class BattleApp {
  public static void main(String[] args) {

    //Pirate JackSparrow = new Pirate();
    //Pirate Johnny = new Pirate();

    Ship pirateShip = new Ship("Pirate Ship");
    Ship otherShip = new Ship("Other Ship");

    pirateShip.fillShip();
    otherShip.fillShip();

    pirateShip.shipInformation();
    otherShip.shipInformation();

    pirateShip.battle(otherShip);
  }
}
