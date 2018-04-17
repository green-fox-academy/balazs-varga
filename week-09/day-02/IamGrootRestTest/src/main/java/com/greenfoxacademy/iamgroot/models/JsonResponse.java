package com.greenfoxacademy.iamgroot.models;

public class JsonResponse {

  private String received;
  private String translated;

  public JsonResponse(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public JsonResponse() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
