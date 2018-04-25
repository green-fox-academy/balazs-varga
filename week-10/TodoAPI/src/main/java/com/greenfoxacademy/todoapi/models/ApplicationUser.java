package com.greenfoxacademy.todoapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationUser {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long userId;
  private String username;
  private String password;

  public ApplicationUser(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public ApplicationUser() {
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
