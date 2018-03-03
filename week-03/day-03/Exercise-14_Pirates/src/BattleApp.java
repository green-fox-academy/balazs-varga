public class BattleApp {
  public static void main(String[] args) {

    Ship pirateShip = new Ship("Pirate Ship");
    Ship otherShip = new Ship("Other Ship");

    Ship englishShip1 = new Ship("First English Ship");
    Ship englishShip2 = new Ship("Second English Ship");
    Ship englishShip3 = new Ship("Third English Ship");
    Ship germanShip1 = new Ship("First German Ship");
    Ship germanShip2 = new Ship("Second German Ship");
    Ship germanShip3 = new Ship("Third German Ship");

    Armada englishArmada = new Armada("English Armada");
    Armada germanArmada = new Armada("German Armada");

    englishArmada.addShipToArmada(englishShip1);
    englishArmada.addShipToArmada(englishShip2);
    englishArmada.addShipToArmada(englishShip3);

    germanArmada.addShipToArmada(germanShip1);
    germanArmada.addShipToArmada(germanShip2);
    germanArmada.addShipToArmada(germanShip3);

    pirateShip.shipInformation();
    otherShip.shipInformation();

    englishArmada.war(germanArmada);

  }
}
