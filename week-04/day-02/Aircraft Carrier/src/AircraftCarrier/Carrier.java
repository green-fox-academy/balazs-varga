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

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }
}
