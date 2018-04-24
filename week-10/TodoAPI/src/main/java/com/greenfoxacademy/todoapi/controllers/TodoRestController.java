package com.greenfoxacademy.todoapi.controllers;

import com.greenfoxacademy.todoapi.modells.JsonResponse;
import com.greenfoxacademy.todoapi.modells.Todo;
import com.greenfoxacademy.todoapi.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

  @Autowired
  TodoRepository todoRepository;

  @PostMapping(value = {"/api/add"})
  public ResponseEntity addTodo(@RequestBody(required = false) Todo newTodo) {
    if (newTodo != null) {
      todoRepository.save(newTodo);
      return new ResponseEntity(new JsonResponse("Ok", todoRepository.findAll()), HttpStatus.OK);
    }
    else {
      return new ResponseEntity(new JsonResponse("Error"), HttpStatus.BAD_REQUEST);
    }
  }
}
