import java.util.Random;

public class Pirate {

  private String name;
  private int drunkLevel;
  private boolean isDead;

  public Pirate(String name) {
    this.name = name;
    this.drunkLevel = 0;
    this.isDead = false;
  }

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println("He's dead.");
    } else {
      this.drunkLevel++;
    }
  }

  public void howItGoingMate() {
    if (isDead) {
      System.out.println("He's dead.");
    } else if(this.drunkLevel >= 0 && this.drunkLevel <= 4 ) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }

  public void die() {
    if(this.drunkLevel == 6) {
      this.isDead = true;
      System.out.println("He's dead.");
    }
  }

  public String getName() {
    return name;
  }

  public void brawl(Pirate pirate) {
    Random random = new Random();

    int randomNumber = random.nextInt(3) + 1;
    System.out.println("~~~~~~~~~~ Let's fight ~~~~~~~~~~~");
    System.out.println(this.getName() + " VS " + pirate.getName());

    if (isDead) {
      System.out.println("He's dead.");
    } else {
      switch (randomNumber) {
        case 1:
          this.die();
          System.out.println("The winner is " + pirate.getName() + ", " + this.getName() + " is dead.");
          break;

        case 2:
          pirate.die();
          System.out.println("The winner is " + this.getName() + ", " + pirate.getName() + " is dead.");
          break;

        case 3:
          this.die();
          pirate.die();
          System.out.println("Both pirates are dead!");
      }
    }
  }
}
