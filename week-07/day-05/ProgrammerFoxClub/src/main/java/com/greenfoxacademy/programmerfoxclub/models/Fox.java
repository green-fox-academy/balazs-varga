package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

  private String name;
  private List<String> tricks = new ArrayList<>();
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

  public String getName() {
    return name;
  }
}
