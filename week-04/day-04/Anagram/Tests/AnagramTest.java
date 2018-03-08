import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram;

  @Before
  public void init() {
    new Anagram("dog", "god");

    String firstWord = anagram.getFirstString();
    String secondWord = anagram.getSecondString();
  }

  @Test
  public void isAnagram() {
    
  }
}