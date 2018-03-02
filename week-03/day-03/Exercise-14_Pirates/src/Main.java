public class Main {
  public static void main(String[] args) {

    Pirate JackSparrow = new Pirate("Jack Sparrow");
    Pirate Johnny = new Pirate("Johnny");


    Pirate.brawl(JackSparrow, Johnny);

    JackSparrow.howItGoingMate();
    Johnny.howItGoingMate();
  }
}
