import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CowsAndBullsTest {

  CowsAndBulls CAB;

  @Before
  public void init() {
    CAB = new CowsAndBulls();
  }

  @Test
  public void defaultCowsValueTest() {
    assertEquals(0, CAB.getCows());
  }

  @Test
  public void defaultBullsValueTest() {
    assertEquals(0, CAB.getBulls());
  }

  @Test
  public void defaultIsPlayingValueTest() {
    assertEquals(false, CAB.getIsPlaying());
  }

  @Test
  public void defaultIsFinishedValueTest() {
    assertEquals(false, CAB.getIsFinished());
  }

  @Test
  public void defaultIsPlayingValueNegativeTest() {
    assertFalse(CAB.getIsPlaying());
  }

  @Test
  public void defaultRoundsValueTest() {
    assertEquals(10, CAB.getRounds());
  }

  @Test
  public void defaultNumberToGuessValueTest() {
    assertTrue(CAB.getNumberToGuess() > 1000 && CAB.getNumberToGuess() < 10000);
  }
}