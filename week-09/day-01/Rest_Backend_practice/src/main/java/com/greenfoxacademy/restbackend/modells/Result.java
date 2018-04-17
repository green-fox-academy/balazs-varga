package com.greenfoxacademy.restbackend.modells;

public class Result extends Response {

  private int result;

  public Result(int result) {
    this.result = result;
  }

  public Result() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
