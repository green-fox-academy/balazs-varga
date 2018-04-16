package com.greenfoxacademy.restbackend.modells;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {

  private String what;
  private int result;
  private List<Integer> numbers;

  public ArrayHandler(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = new ArrayList<>(java.util.Arrays.asList(1, 2, 5, 10));
  }

  public ArrayHandler() {
  }

  public int sum() {
    what = "sum";
    result = 0;
    for (int i = 0; i < numbers.size(); i++) {
      result += numbers.get(i);
    }
    return result;
  }

  public int multiply() {
    what = "multiply";
    result = 1;
    for (int i = 0; i < numbers.size(); i++) {
      result *= numbers.get(i);
    }
    return result;
  }

  public List<Integer> doubleValues() {
    what = "double";
    List<Integer> doubledList = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      doubledList.add(numbers.get(i) * 2);
    }
    return doubledList;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
