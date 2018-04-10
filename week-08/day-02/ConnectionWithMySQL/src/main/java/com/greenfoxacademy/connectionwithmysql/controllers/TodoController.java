package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"/todo/", "todo/list"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findAllByDone(!isActive));
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @GetMapping(value = {"/todo/add"})
  public String add(Model model) {
    return "add_todo";
  }
}