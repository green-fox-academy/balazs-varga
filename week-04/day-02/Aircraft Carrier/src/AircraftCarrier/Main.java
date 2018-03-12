package AircraftCarrier;

public class Main {

  public static void main(String[] args) {
    Carrier firstCarrier = new Carrier(2300, 5000);
    firstCarrier.add("F16");
    firstCarrier.add("F35");
    firstCarrier.add("F16");
    firstCarrier.add("F35");
    firstCarrier.add("F35");

    firstCarrier.fill();
    firstCarrier.getStatus();

    Carrier secondCarrier = new Carrier(400, 5000);
    secondCarrier.add("F16");
    secondCarrier.add("F16");
    secondCarrier.add("F35");
    secondCarrier.add("F35");
    secondCarrier.add("F35");

    secondCarrier.fill();
    secondCarrier.getStatus();

    firstCarrier.fight(secondCarrier);
    firstCarrier.getStatus();
    secondCarrier.getStatus();
  }
}
