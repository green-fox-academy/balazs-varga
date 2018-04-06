package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.Temp.Util;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoxServiceImpl implements FoxService {

  private FoxRepository foxRepository;

  @Autowired
  public FoxServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @Override
  public Fox login(String name) {
    if (!name.equals("")) {
      Fox fox = foxRepository.findOne(name);
      if (fox == null) {
        foxRepository.addFox(name);
        fox = foxRepository.findOne(name);
        return fox;
      }
      return fox;
    }
    return null;
  }

  @Override
  public Fox findOne(String name) {
    return foxRepository.findOne(name);
  }

  @Override
  public boolean checkLogged(Fox fox) {
    return Util.loggedInFox == fox;
  }
}
