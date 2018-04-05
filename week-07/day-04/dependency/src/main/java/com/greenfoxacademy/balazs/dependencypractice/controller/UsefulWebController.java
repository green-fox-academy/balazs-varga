package com.greenfoxacademy.balazs.dependencypractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulWebController {

  @GetMapping(value = "/useful")
  public String linkToUtilities() {
    return "links_to_utilities";
  }
}
