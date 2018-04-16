package com.greenfoxacademy.restbackend.modells;

public class Doubling {
  private int received;
  private int result;
  private String error;

  public Doubling(int received) {
    this.received = received;
    this.result = 2 * received;
  }

  public Doubling() {
    error = "Please provide an input!";
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
