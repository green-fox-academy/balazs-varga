public class Main {
  public static void main(String[] args) {

    Pirate JackSparrow = new Pirate("Jack Sparrow");
    Pirate Johnny = new Pirate("Johnny");

    JackSparrow.drinkSomeRum();
    JackSparrow.drinkSomeRum();
    JackSparrow.drinkSomeRum();
    JackSparrow.howItGoingMate();

    JackSparrow.brawl(Johnny);
  }
}
