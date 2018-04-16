package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.modells.Doubling;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @GetMapping(value = {"/doubling"})
  public Object doubling(@RequestParam(name = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new Doubling();
    }
  }
}
