package com.greenfoxacademy.connectionwithmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public Todo() {
  }

  public String getTitle() {
    return title;
  }
}