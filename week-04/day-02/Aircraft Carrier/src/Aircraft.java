public class Aircraft {

  String name;
  public int ammoAmount;

  public Aircraft(String name) {
    this.name = name;
    this.ammoAmount = 0;
  }

  public String getName() {
    return name;
  }

  public int getAmmoAmount() {
    return ammoAmount;
  }
}
