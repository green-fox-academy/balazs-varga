package com.greenfoxacademy.todoapi.repositories;

import com.greenfoxacademy.todoapi.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {
  List<ApplicationUser> findAll();
  ApplicationUser findByUsername(String username);
}
