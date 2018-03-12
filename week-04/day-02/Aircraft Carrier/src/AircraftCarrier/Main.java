package AircraftCarrier;

public class Main {

  public static void main(String[] args) {
    Carrier carrier = new Carrier(2300, 5000);
    carrier.add("F16");
    carrier.add("F35");
    carrier.add("F16");
    carrier.add("F35");
    carrier.add("F35");

    carrier.fill();
    carrier.getStatus();
  }
}
