public class Aircraft {

  private String type;
  private int ammoAmount;
  private int maxAmmo;
  private int baseDamage;

  public Aircraft(String type) {
    this.type = type;
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

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}
