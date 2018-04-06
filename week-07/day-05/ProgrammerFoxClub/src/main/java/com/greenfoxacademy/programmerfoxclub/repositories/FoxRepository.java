package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

@Component
public interface FoxRepository {

  void addFox(String name);
  Fox findOne(String name);
}
