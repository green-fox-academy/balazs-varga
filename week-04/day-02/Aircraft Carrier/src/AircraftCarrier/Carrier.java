package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> carrier;
  private int ammoStorage;
  private int health;

  public Carrier(int ammoStorage, int health) {
    this.ammoStorage = ammoStorage;
    this.health = health;
    carrier = new ArrayList<>();
  }

  public void add(String aircraftType) {
    if (aircraftType.toUpperCase().equals("F16")) {
      carrier.add(new F16());
    } else if (aircraftType.toUpperCase().equals("F35")) {
      carrier.add(new F35());
    } else {
      System.out.println("Please add F16 or F35");
    }
  }
}
