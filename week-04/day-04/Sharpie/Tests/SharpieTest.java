import org.junit.Before;

import static org.junit.Assert.*;

public class SharpieTest {

  Sharpie sharpie;

  @Before
  void init() {
    sharpie = new Sharpie("green", 3);
  }
}