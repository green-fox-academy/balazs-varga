import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {

  private List<Ship> ships = new ArrayList<Ship>();
  private Random randomNumber = new Random();
  private int armadaCapacity;
  private String armadaName;

  public Armada(String armadaName) {
    this.armadaName = armadaName;
    armadaCapacity = randomNumber.nextInt(10) + 3;
  }

}
