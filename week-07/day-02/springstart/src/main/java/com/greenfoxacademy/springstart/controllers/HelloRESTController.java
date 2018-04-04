package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong id = new AtomicLong();

  @GetMapping(value="/greeting")
  public Greeting greeting(@RequestParam(name = "name") String name) {
    return new Greeting(id.addAndGet(1),"Hello, " + name + "!");
  }
}
