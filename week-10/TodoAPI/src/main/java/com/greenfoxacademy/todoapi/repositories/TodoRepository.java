package com.greenfoxacademy.todoapi.repositories;

import com.greenfoxacademy.todoapi.modells.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();
}
