package com.greenfoxacademy.balazs.dependencypractice.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }
}