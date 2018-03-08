import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters string;

  @Before
  public void init() {
    string = new CountLetters("asaffgrgha");
  }

  @Test
  public void letterAOccurrenceCountTest() {
    assertEquals( (Integer) 3, string.letterOccurrenceCount(string.getString()).get('a'));
  }

  @Test
  public void letterFOccurrenceCountTest() {
    assertEquals((Integer) 2, string.letterOccurrenceCount(string.getString()).get('f'));
  }

  @Test
  public void letterSOccurrenceCountNegativeTest() {
    assertFalse(string.letterOccurrenceCount(string.getString()).get('s') == (Integer) 4);
  }
}