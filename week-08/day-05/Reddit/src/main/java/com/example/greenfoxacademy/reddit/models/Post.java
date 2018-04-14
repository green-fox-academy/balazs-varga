package com.example.greenfoxacademy.reddit.models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private int voteNumber;
  private String url;
  private String title;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    voteNumber = 0;
  }

  public Post() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getVoteNumber() {
    return voteNumber;
  }

  public void setVoteNumber(int voteNumber) {
    this.voteNumber = voteNumber;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
