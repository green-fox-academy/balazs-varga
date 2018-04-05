package com.greenfoxacademy.balazs.dependencypractice.models;

public class RedColor implements MyColor{
  @Override
  public String printColor() {
    return "This is a red color...";
  }
}
