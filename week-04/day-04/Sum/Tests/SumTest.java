import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  Sum numbers;

  @Before
  public void init() {
    numbers = new Sum();
  }

  @Test
  public void sumOfNumbersTest() {
    List<Integer> arrayNumbers = new ArrayList<>();
    arrayNumbers.add(1);
    arrayNumbers.add(2);
    arrayNumbers.add(3);
    assertEquals(6, numbers.sumOfNumbers(arrayNumbers));
  }
}