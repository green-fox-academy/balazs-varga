public class Main {
  public static void main(String[] args) {

    Station petrolStation = new Station(400);
    Car ferrari = new Car();

    System.out.println("The car has " + ferrari.gasAmount + " l gas before the gas refill.");

    for (int i = 0; i < ferrari.capacity; i++) {
      petrolStation.refill(ferrari);
    }

    System.out.println("After a refill, the cas has " + ferrari.gasAmount + " l gas.");
  }
}
