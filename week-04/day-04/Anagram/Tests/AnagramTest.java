import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void isAnagramTest() {
    Anagram anagram = new Anagram();
    assertTrue(anagram.isAnagram("dog", "god"));
  }
}