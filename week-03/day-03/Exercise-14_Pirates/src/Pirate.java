import java.util.Random;

public class Pirate {

  private String name;
  private int drunkLevel;
  private boolean isDead;
  private boolean isSleep;

  public Pirate(String name) {
    this.name = name;
    this.drunkLevel = 0;
    this.isDead = false;
    this.isSleep = false;
  }

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println(this.getName() + " is dead.");
    } else {
      this.drunkLevel++;
    }
  }

  public void howItGoingMate() {
    if (isDead) {
      System.out.println(this.getName() + " is dead.");
    } else if(this.drunkLevel >= 0 && this.drunkLevel <= 4 ) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      System.out.println(this.getName() + " passes out...");
      this.sleep();
    }
  }

  public void sleep() {
    this.isSleep = true;
    System.out.println(this.getName() + " drank too much so he's going to sleep...");
  }

  public void die() {
    this.isDead = true;
    System.out.println(this.getName() + " is dead.");
  }

  public static void brawl(Pirate pirate1, Pirate pirate2) {
    Random random = new Random();

    int randomNumber = random.nextInt(3) + 1;
    System.out.println("~~~~~~~~~~ Let's fight ~~~~~~~~~~~");
    System.out.println(pirate1.getName() + " VS " + pirate2.getName());

    if (pirate1.isDead || pirate2.isDead) {
      System.out.println("He's dead.");
    } else {
      switch (randomNumber) {
        case 1:
          pirate1.die();
          System.out.println("The winner is " + pirate2.getName() + ", " + pirate1.getName() + " is dead.");
          break;

        case 2:
          pirate2.die();
          System.out.println("The winner is " + pirate1.getName() + ", " + pirate2.getName() + " is dead.");
          break;

        case 3:
          pirate1.die();
          pirate2.die();
          System.out.println("Both pirates are dead!");
          break;
      }
    }
  }

  public String getName() {
    return name;
  }
}
