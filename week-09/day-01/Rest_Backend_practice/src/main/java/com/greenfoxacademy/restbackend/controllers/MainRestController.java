package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.modells.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @GetMapping(value = {"/doubling"})
  public Response doubling(@RequestParam(name = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new ErrorObject("Please provide an input!");
    }
  }

  @GetMapping(value = {"/greeter"})
  public Response greeter(@RequestParam(name = "name", required = false) String name,
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
  public ResponseEntity<Response> appendA(@PathVariable(value = "appendable") String appendable) {
    return new ResponseEntity<>(new AppendA(appendable), HttpStatus.OK);
  }

  @PostMapping(value = {"/dountil/{what}"})
  public Response doUntil(@PathVariable(value = "what") String what, @RequestBody(required = false) DoUntil until) {
    if (until != null) {
      if (what.equals("sum")) {
        return new Result(until.sum());
      } else if (what.equals("factor")) {
        return new Result(until.factor());
      }
    } else {
      return new ErrorObject("Please provide a number!");
    }
    return new ErrorObject("Please provide a number!");
  }

  @PostMapping(value = {"/arrays"})
  public Response arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandler) {
    if (arrayHandler.getWhat() == null) {
      return new ErrorObject("Please provide what to do with the numbers!");
    } else if (arrayHandler.getNumbers() == null) {
      return new ErrorObject("Please provide numbers!");
    } else if (arrayHandler.getWhat().equals("sum")) {
      return new Result(arrayHandler.sum());
    } else if (arrayHandler.getWhat().equals("multiply")) {
      return new Result(arrayHandler.multiply());
    } else if (arrayHandler.getWhat().equals("double")) {
      return new ResultList(arrayHandler.doubleValues());
    }
    return new ErrorObject("Please provide what to do with the numbers!");
  }
}
