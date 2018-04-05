package com.greenfoxacademy.balazs.dependencypractice.model;

public class RedColor implements MyColor{
  @Override
  public String printColor() {
    return "This is a red color...";
  }
}
