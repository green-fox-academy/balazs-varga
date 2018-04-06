package com.greenfoxacademy.programmerfoxclub.Temp;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxDB {

  public final List<Fox> FOXES = new ArrayList<>();
}
