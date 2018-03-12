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

  public void fill() {
    int neededAmmo = 0;
    if (ammoStorage == 0) {
      System.out.println("There is no more available ammo.");
    } else {
      for (int i = 0; i < carrier.size(); i++) {
        neededAmmo += carrier.get(i).getMaxAmmo();
      }
    }
    if (neededAmmo > ammoStorage) {
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).getType().equals("F35") && ammoStorage > 0) {
          carrier.get(i).refill(ammoStorage);
          ammoStorage -= carrier.get(i).getAmmoAmount();
        }
      }
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).getType().equals("F16") && ammoStorage > 0) {
          carrier.get(i).refill(ammoStorage);
          ammoStorage -= carrier.get(i).getAmmoAmount();
        }
      }
    }
  }
}
