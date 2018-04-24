package com.greenfoxacademy.todoapi.repositories;

import com.greenfoxacademy.todoapi.modells.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
