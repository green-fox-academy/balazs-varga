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

  @Test
  public void thirstLevelAfterDrinkingTest() {
    animal.drink();
    animal.drink();
    animal.drink();
    assertEquals(47, animal.getThirst());
  }

  @Test
  public void thirstLevelAfterDrinkingNegativeTest() {
    animal.drink();
    animal.drink();
    animal.drink();
    assertFalse(animal.getThirst() == 49);
  }

  @Test
  public void hungerLevelAfterPlayingTest() {
    animal.play();
    assertEquals(51, animal.getHunger());
  }
}