public class Main {
  public static void main(String[] args) {

    Animal bear = new Animal();

    bear.drink();
    bear.eat();
    bear.play();
    bear.eat();
    bear.eat();
    bear.drink();

    System.out.println(bear.getHunger());
    System.out.println(bear.getThirst());
  }
}
