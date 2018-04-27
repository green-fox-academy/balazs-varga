package com.greenfoxacademy.todoapi.services;

import com.greenfoxacademy.todoapi.models.Todo;
import com.greenfoxacademy.todoapi.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoService {

  @Autowired
  TodoRepository todoRepository;

  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  public Todo save(Todo todo) {
    return todoRepository.save(todo);
  }

  public Todo findById(long id) {
    return todoRepository.findById(id);
  }

  public Todo findByTitle(String title) {
    return todoRepository.findByTitle(title);
  }
}
