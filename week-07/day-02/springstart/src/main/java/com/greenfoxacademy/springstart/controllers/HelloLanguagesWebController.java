package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
public class HelloLanguagesWebController {

  Greeting greeting = new Greeting();
  Random random = new Random();

  @RequestMapping("/web/hello")
  public String hellos(Model model, String hello) {
    model.addAttribute("hello", greeting.getHellos());
    return "greetinglanguages";
  }
}
