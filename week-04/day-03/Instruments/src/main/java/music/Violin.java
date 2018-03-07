package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    super(4);
    setName("Violin");
  }

  @Override
  public void sound() {
    setSound("Screech");
  }

  @Override
  public void play() {
    sound();
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + getSound() + ".");
  }
}
