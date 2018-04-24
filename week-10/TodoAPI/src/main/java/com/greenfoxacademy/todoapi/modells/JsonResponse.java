package com.greenfoxacademy.todoapi.modells;

import java.util.List;

public class JsonResponse {

  private String result;
  private List<Todo> data;

  public JsonResponse(String result, List<Todo> data) {
    this.result = result;
    this.data = data;
  }

  public JsonResponse(String result) {
    this.result = result;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Todo> getData() {
    return data;
  }

  public void setData(List<Todo> data) {
    this.data = data;
  }
}