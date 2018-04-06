package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.Temp.FoxDB;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoxRepositoryImpl implements FoxRepository {

  private FoxDB foxDB;

  @Autowired
  public FoxRepositoryImpl(FoxDB foxDB) {
    this.foxDB = foxDB;
  }

  @Override
  public void addFox(String name) {
    foxDB.FOXES.add(new Fox(name));
  }

  @Override
  public Fox findOne(String name) {
    for (Fox fox : foxDB.FOXES) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return null;
  }
}
