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
    List<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(1, 2, 3));
    assertEquals(6, numbers.sumOfNumbers(arrayNumbers));
  }

  @Test
  public void sumOfNumbersTestEmpty() {
    List<Integer> arrayNumbers = new ArrayList<>();
    assertEquals(0, numbers.sumOfNumbers(arrayNumbers));
  }

  @Test
  public void sumOfNumbersTestOneElement() {
    List<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(1));
    assertEquals(1, numbers.sumOfNumbers(arrayNumbers));
  }
}