package com.greenfoxacademy.todoapi.models;

import java.util.List;

public class JsonResponse {

  private String status;
  private List<Todo> data;

  public JsonResponse(String result, List<Todo> data) {
    this.status = result;
    this.data = data;
  }

  public JsonResponse(String result) {
    this.status = result;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<Todo> getData() {
    return data;
  }

  public void setData(List<Todo> data) {
    this.data = data;
  }
}