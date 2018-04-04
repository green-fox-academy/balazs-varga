package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong id = new AtomicLong();

  @GetMapping(value = "/web/greeting")
  public String greeting(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("count", id.addAndGet(1));
    return "greeting";
  }
}
