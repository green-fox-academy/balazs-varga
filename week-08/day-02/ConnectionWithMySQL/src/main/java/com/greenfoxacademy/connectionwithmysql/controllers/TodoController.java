package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"/todo/", "todo/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}