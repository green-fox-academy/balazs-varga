package com.greenfoxacademy.todoapi.models;

import javax.persistence.*;

@Entity
public class Todo {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public Todo() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean isUrgent) {
    this.isUrgent = isUrgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean isDone) {
    this.isDone = isDone;
  }
}