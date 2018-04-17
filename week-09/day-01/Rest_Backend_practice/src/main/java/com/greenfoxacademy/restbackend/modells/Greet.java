package com.greenfoxacademy.restbackend.modells;

public class Greet extends Response {

  private String welcome_message;

  public Greet(String welcomeMessage) {
    this.welcome_message = welcomeMessage;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
