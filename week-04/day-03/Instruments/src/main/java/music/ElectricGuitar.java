package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super(6);
    setName("Electric Guitar");
  }

  public ElectricGuitar(int newNumberOfStrings) {
    super(newNumberOfStrings);
    setName("Electric Guitar");
  }

  @Override
  public void sound() {
    setSound("Twang");
  }

  @Override
  public void play() {
    sound();
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + getSound() + ".");
  }
}
