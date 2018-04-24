package com.greenfoxacademy.todoapi.repositories;

import com.greenfoxacademy.todoapi.modells.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {
  ApplicationUser findByUsername(String username);
}
