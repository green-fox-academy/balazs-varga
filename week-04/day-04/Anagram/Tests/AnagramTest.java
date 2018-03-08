import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void isAnagramTest() {
    Anagram anagram = new Anagram("dog", "god");;
    assertTrue(anagram.isAnagram(anagram.getFirstString(), anagram.getSecondString()));
  }
}