package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4);
    setName("Bass Guitar");
  }

  public BassGuitar(int newNumberOfStrings) {
    super(newNumberOfStrings);
    setName("Bass Guitar");
  }

  @Override
  public void sound() {
    setSound("Duum-duum-duum");
  }

  @Override
  public void play() {
    sound();
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + getSound() + ".");
  }
}
