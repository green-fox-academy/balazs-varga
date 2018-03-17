import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

  Animal animal;

  @Before
  public void setUp() {
    animal = new Animal();
  }

  @Test
  public void defaultHungerLevelTest() {
    assertEquals(50, animal.getHunger());
  }

  @Test
  public void defaultThirstLevelTest() {
    assertEquals(50, animal.getThirst());
  }

  @Test
  public void hungerLevelAfterEatingTest() {
    animal.eat();
    assertEquals(49, animal.getHunger());
  }
}