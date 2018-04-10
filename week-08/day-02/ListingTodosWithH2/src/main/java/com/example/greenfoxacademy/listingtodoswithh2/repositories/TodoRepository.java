package com.example.greenfoxacademy.listingtodoswithh2.repositories;

import com.example.greenfoxacademy.listingtodoswithh2.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
