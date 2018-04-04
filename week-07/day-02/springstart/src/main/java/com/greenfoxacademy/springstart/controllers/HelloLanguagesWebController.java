package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;

@Controller
public class HelloLanguagesWebController {

  Greeting greeting = new Greeting();
  Random random = new Random();

  @GetMapping(value = "/web/hello")
  public String hellos(Model model, String hello) {
    model.addAttribute("hello", greeting.getHellos());
    String randomR = String.valueOf(random.nextInt(255));
    String randomG = String.valueOf(random.nextInt(255));
    String randomB = String.valueOf(random.nextInt(255));
    model.addAttribute("color", "color: rgb("+ randomR + "," + randomG + "," + randomB + ")");
    return "greetinglanguages";
  }
}
