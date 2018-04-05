package com.greenfoxacademy.balazs.dependencypractice.model;

public class RedColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("This is a red color...");
  }
}
