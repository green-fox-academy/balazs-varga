package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

@Component
public interface FoxService {

  Fox login(String name);
  Fox findOne(String name);
  boolean checkLogged(Fox fox);
}
