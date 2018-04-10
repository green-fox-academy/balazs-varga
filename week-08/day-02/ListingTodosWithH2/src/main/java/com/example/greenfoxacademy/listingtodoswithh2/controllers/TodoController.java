package com.example.greenfoxacademy.listingtodoswithh2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @GetMapping(value = {"/todo/", "todo/list"})
  @ResponseBody
  public String list(Model model) {
    return "Thanks For Posting!!!";
  }
}