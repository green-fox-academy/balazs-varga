package com.example.greenfoxacademy.listingtodoswithh2.models;

public class Todo {

  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}
