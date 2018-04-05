package com.greenfoxacademy.balazs.dependencypractice.model;

import java.time.LocalDateTime;

public class Printer {
  public String log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }
}
