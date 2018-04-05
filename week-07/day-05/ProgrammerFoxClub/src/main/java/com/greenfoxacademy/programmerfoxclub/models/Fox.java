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

  public Fox() {
    this("Jane Doe");
  }

  private void addTrick(String trick) {
    tricks.add(trick);
  }
}
