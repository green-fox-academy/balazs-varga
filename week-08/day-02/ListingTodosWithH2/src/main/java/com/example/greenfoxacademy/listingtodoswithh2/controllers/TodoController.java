package com.example.greenfoxacademy.listingtodoswithh2.controllers;

import com.example.greenfoxacademy.listingtodoswithh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"/todo/", "todo/list"})
  public String list() {
    return "todolist";
  }
}