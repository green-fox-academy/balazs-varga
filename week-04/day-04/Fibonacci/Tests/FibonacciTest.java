import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci fibonacci;

  @Before
  public void init() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void fibonacciTest() {
    assertEquals(1, fibonacci.fibonacci(2));
  }

  @Test
  public void fibonacciTrueTest() {
    assertTrue(fibonacci.fibonacci(4) == 3);
  }

  @Test
  public void fibonacciNegativeTest() {
    assertFalse(fibonacci.fibonacci(8) == 3);
  }
}