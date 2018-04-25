package com.greenfoxacademy.todoapi.controllers;

import com.greenfoxacademy.todoapi.models.ApplicationUser;
import com.greenfoxacademy.todoapi.models.JsonResponse;
import com.greenfoxacademy.todoapi.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationUserRestController {

  @Autowired
  ApplicationUserRepository applicationUserRepository;

  @PostMapping(value = {"/sign_up"})
  public ResponseEntity register(@RequestBody(required = true) ApplicationUser newApplicationUser) {
    if (newApplicationUser != null) {
      applicationUserRepository.save(newApplicationUser);
      return new ResponseEntity(new JsonResponse("User is registered"), HttpStatus.OK);
    }
    else {
      return new ResponseEntity(new JsonResponse("Error"), HttpStatus.BAD_REQUEST);
    }
  }
}
