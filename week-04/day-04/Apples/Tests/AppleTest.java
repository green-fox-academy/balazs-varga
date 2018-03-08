import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  Apple apple;

  @Before
  public void init() {
    apple = new Apple("apple");
  }

  @Test
  public void getAppleTest() {
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void getAppleNegativeTest() {
    assertFalse("pear", apple.getApple() == "pear");
  }
}