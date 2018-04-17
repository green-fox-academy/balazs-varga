package com.greenfoxacademy.iamgroot.controllers;

import com.greenfoxacademy.iamgroot.models.JsonError;
import com.greenfoxacademy.iamgroot.models.JsonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object grootTranslator(@RequestParam(name = "message", required = false) String message) {
    if (message != null) {
      return new JsonResponse(message);
    } else {
      return new JsonError();
    }
  }
}
