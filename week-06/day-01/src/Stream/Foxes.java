package Stream;

import java.util.ArrayList;
import java.util.List;

public class Foxes {

  List<Fox> foxes;

  public Foxes() {
    foxes = new ArrayList<>();
  }

  public void add(Fox fox) {
    foxes.add(fox);
  }

  public List<Fox> getFoxes() {
    return foxes;
  }
}
