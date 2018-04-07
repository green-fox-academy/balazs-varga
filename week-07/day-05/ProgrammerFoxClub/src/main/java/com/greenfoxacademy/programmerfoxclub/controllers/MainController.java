package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Temp.Util;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(value = "/")
  public String mainPage(Model model, @RequestParam(name = "name", required = false) String name) {
    if (Util.loggedInFox == null || foxService.findOne(name) == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxService.findOne(name));
      model.addAttribute("numberOfTricks", foxService.findOne(name).getTricks().size());
      model.addAttribute("trickList", foxService.findOne(name).getTricks());
      model.addAttribute("checklog", foxService.checkLogged(foxService.findOne(name)));
      model.addAttribute("nutritionPage", "/nutritionStore?name=" + name);
      return "index";
    }
  }
}
