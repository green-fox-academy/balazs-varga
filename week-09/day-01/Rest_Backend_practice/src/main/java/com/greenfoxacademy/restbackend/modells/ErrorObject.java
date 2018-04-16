package com.greenfoxacademy.restbackend.modells;

public class ErrorObject {
  private String error;

  public ErrorObject(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
