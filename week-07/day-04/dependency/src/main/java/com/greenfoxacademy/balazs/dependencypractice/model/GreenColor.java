package com.greenfoxacademy.balazs.dependencypractice.model;

import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor{
  @Override
  public String printColor() {
    return "This is a green color...";
  }
}
