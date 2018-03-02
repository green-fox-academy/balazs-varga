import java.util.Random;

public class Pirate {

  private Random randomDrunkLevel = new Random();

  private String name;
  private int drunkLevel;
  private boolean isDead;
  private boolean isSleep;
  private boolean isPirate;
  private boolean isCaptain;

  public Pirate() {
    name = generateName();
    drunkLevel = randomDrunkLevel.nextInt(4);
    isDead = false;
    isSleep = false;
    isPirate = true;
    isCaptain = false;
  }

  public Pirate(boolean isCaptain) {
    this.isCaptain = isCaptain;
    name = generateName();
    drunkLevel = randomDrunkLevel.nextInt(4);
    isDead = false;
    isSleep = false;
    isPirate = true;
  }

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println(getName() + " is dead.");
    } else {
      drunkLevel++;
    }
  }

  public void howItGoingMate() {
    if (isDead) {
      System.out.println(getName() + " is dead.");
    } else if(drunkLevel >= 0 && drunkLevel <= 4 ) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      System.out.println(getName() + " passes out...");
      sleep();
    }
  }

  public void sleep() {
    isSleep = true;
    System.out.println(getName() + " drank too much so he's going to sleep...");
  }

  public void die() {
    isDead = true;
    System.out.println(getName() + " is dead.");
  }

  @Override
  public String toString() {
    return "Pirate{" +
            "name='" + name + '\'' +
            ", isPirate=" + isPirate +
            ", isCaptain=" + isCaptain +
            '}';
  }

  public void setCaptain () {
    isPirate = false;
    isCaptain = true;
  }

  public void brawl(Pirate pirate) {
    Random random = new Random();

    int randomNumber = random.nextInt(3) + 1;
    System.out.println("~~~~~~~~~~ Let's fight ~~~~~~~~~~~");
    System.out.println(this.getName() + " VS " + pirate.getName());

    if (this.isDead || pirate.isDead) {
      System.out.println("He's dead.");
    } else {
      switch (randomNumber) {
        case 1:
          this.die();
          System.out.println("The winner is " + pirate.getName() + ", " + this.getName() + " is dead.");
          System.out.println("~~~~~~~~~~~~~~~~~~~");
          break;

        case 2:
          pirate.die();
          System.out.println("The winner is " + this.getName() + ", " + pirate.getName() + " is dead.");
          System.out.println("~~~~~~~~~~~~~~~~~~~");
          break;

        case 3:
          this.die();
          pirate.die();
          System.out.println("Both pirates are dead!");
          System.out.println("~~~~~~~~~~~~~~~~~~~");
          break;
      }
    }
  }

  public static String generateName() {
     String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk" };
     String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
            "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
            "marac", "zoir", "slamar", "salmar", "urak" };
     String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
            "tron", "med", "ure", "zur", "cred", "mur" };

     Random rand = new Random();

    return Beginning[rand.nextInt(Beginning.length)] +
            Middle[rand.nextInt(Middle.length)]+
            End[rand.nextInt(End.length)];
  }

  public int getDrunkLevel() {
    return drunkLevel;
  }

  public String getName() {
    return name;
  }

  public boolean isDead() {
    return isDead;
  }

  public boolean isCaptain() {
    return isCaptain;
  }

  public boolean isSleep() {
    return isSleep;
  }
}
