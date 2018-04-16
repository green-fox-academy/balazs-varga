package com.greenfoxacademy.restbackend.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class MainController {

  @GetMapping(value = {"/"})
  public String showIndexPage() {
    return "index";
  }
}
