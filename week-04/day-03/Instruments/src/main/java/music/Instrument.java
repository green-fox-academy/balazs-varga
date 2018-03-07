package main.java.music;

public abstract class Instrument {

  protected String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract void play();

}
