package AircraftCarrier;

public class Aircraft {

  private String type;
  private int ammoAmount;
  private int maxAmmo;
  private int baseDamage;

  public Aircraft(String type, int maxAmmo, int baseDamage) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    ammoAmount = 0;
  }

  public int fight() {
    int damage = baseDamage * ammoAmount;
    ammoAmount = 0;
    return damage;
  }

  public int refill(int refillAmmoAmount) {
    if (refillAmmoAmount > 0) {
      for (int i = 0; i < refillAmmoAmount; i++) {
        if (ammoAmount < maxAmmo) {
          ammoAmount++;
          refillAmmoAmount--;
        }
      }
      return refillAmmoAmount;
    }
    System.out.println("Not Enough Ammo to refill the " + type);
    return 0;
  }

  public String getType() {
    return type;
  }

  public String getStatus () {
    return "Type " + type + ", Ammo: " + ammoAmount + ", Base Damage: " + baseDamage + ", All Damage: "
            + ammoAmount * baseDamage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getAmmoAmount() {
    return ammoAmount;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}
