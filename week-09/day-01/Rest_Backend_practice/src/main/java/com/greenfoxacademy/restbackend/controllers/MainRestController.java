package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.modells.AppendA;
import com.greenfoxacademy.restbackend.modells.Doubling;
import com.greenfoxacademy.restbackend.modells.ErrorObject;
import com.greenfoxacademy.restbackend.modells.Greet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MainRestController {

  @GetMapping(value = {"/doubling"})
  public Object doubling(@RequestParam(name = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new ErrorObject("Please provide an input!");
    }
  }

  @GetMapping(value = {"/greeter"})
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                        @RequestParam(name = "title", required = false) String title) {
    if (name == null) {
      return new ErrorObject("Please provide a name!");
    } else if (title == null) {
      return new ErrorObject("Please provide a title!");
    } else {
      return new Greet("Oh, hi there " + name + ", my dear " + title + "!");
    }
  }

  @GetMapping(value = {"/appenda/{appendable}"})
  public ResponseEntity<Object> appendA(@PathVariable(value = "appendable") String appendable) {
    return new ResponseEntity<>( new AppendA(appendable), HttpStatus.OK);
  }
}
