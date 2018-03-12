public class Aircraft {

  private String type;
  private int ammoAmount;
  private int maxAmmo;
  private int baseDamage;

  public Aircraft(String type) {
    this.type = type;
    this.ammoAmount = 0;
  }

  public int fight() {
    int ammoBeforeFight = ammoAmount;
    ammoAmount = 0;
    return ammoBeforeFight * baseDamage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}
