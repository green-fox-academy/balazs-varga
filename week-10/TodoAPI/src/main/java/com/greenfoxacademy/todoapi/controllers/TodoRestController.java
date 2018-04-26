package com.greenfoxacademy.todoapi.controllers;

import com.greenfoxacademy.todoapi.models.JsonResponse;
import com.greenfoxacademy.todoapi.models.Todo;
import com.greenfoxacademy.todoapi.repositories.TodoRepository;
import com.greenfoxacademy.todoapi.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

  @Autowired
  TodoService todoService;

  @PostMapping(value = {"/api/add"})
  public ResponseEntity addTodo(@RequestBody(required = false) Todo newTodo) {
    if (newTodo != null) {
      todoService.save(newTodo);
      return new ResponseEntity(new JsonResponse(newTodo.getTitle() + " is added to the todolist"), HttpStatus.OK);
    }
    else {
      return new ResponseEntity(new JsonResponse("Error"), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping(value = {"/api/list"})
  public ResponseEntity listTodos() {
    if (todoService.findAll().size() != 0) {
      return new ResponseEntity(new JsonResponse("Ok", todoService.findAll()), HttpStatus.OK);
    } else {
      return new ResponseEntity(new JsonResponse("The list is empty"), HttpStatus.OK);
    }
  }
}
