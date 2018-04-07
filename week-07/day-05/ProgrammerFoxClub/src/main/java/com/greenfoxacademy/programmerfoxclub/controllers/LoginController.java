package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Temp.Util;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

  private FoxService foxService;

  @Autowired
  public LoginController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(value = "/login")
  public String loginPage() {
    Util.loggedInFox = null;
    return "login";
  }

  @PostMapping(value = "/login")
  public String login(@ModelAttribute(name = "foxName") String foxName) {
    Fox fox = foxService.login(foxName);
    if (fox != null) {
      Util.loggedInFox = fox;
      return "redirect:/?name=" + foxName;
    } else {
      return "redirect:/login";
    }
  }
}
