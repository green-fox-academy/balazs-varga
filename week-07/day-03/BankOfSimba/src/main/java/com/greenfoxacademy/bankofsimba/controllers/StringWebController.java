package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StringWebController {

  @GetMapping(value="/enjoy")
  public String printString(Model model) {
    model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }
}
