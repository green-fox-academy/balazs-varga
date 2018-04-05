package com.greenfoxacademy.programmerfoxclub.models;

import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox(String name) {
    this.name = name;
  }

  private void addTrick(String trick) {
    tricks.add(trick);
  }
}
