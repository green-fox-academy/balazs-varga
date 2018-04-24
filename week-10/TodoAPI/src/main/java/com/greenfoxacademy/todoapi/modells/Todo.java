package com.greenfoxacademy.todoapi.modells;

import javax.persistence.*;

@Entity
public class Todo {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private String isUrgent;
  private String isDone;

  public Todo(String title, String isUrgent, String isDone) {
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

  public String getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(String isUrgent) {
    this.isUrgent = isUrgent;
  }

  public String getIsDone() {
    return isDone;
  }

  public void setIsDone(String isDone) {
    this.isDone = isDone;
  }
}