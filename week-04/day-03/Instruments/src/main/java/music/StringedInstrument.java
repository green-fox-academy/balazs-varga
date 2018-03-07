package main.java.music;

public abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;
  private String sound;

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  public abstract void sound();
}
