import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

  Sharpie sharpie;

  @Before
  public void init() {
    sharpie = new Sharpie("green", 3);
  }

  @Test
  public void SharpieDefaultInkAmountTest() {
    assertEquals(100.0, sharpie.getInkAmount(), 0);
  }

  @Test
  public void SharpieColorTest() {
    assertEquals("green", sharpie.getColor());
  }

  @Test
  public void SharpieWidthTest() {
    assertEquals(3, sharpie.getWidth(), 0);
  }

  @Test
  public void SharpieNegativeColorTest() {
    assertFalse(sharpie.getColor().equals("blue"));
  }

  @Test
  public void SharpieNegativeWidthTest() {
    assertFalse(sharpie.getWidth() == 9);
  }
}