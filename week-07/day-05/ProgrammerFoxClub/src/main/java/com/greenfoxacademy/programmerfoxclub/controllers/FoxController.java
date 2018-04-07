package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Temp.Util;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxService foxService;

  @Autowired
  public FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(value = "/nutritionStore")
  public String nutritionStorePage(@RequestParam(name = "name", required = false) String foxName, Model model) {
    model.addAttribute("nutritionStorePage", "nutritionStore?name=" + foxName);
    model.addAttribute("foxName", foxName);
    if (Util.loggedInFox == null || foxService.findOne(foxName) == null) {
      return "redirect:/login";
    } else {
      return "nutritionstore";
    }
  }

  @PostMapping (value = "/nutritionStore")
  public String nutritionSetPage(@RequestParam(name = "name", required = false) String foxName,
                                 @ModelAttribute(name = "foodName") String foodName,
                                 @ModelAttribute(name = "drinkName") String drinkName) {
    foxService.findOne(foxName).setFood(foodName);
    foxService.findOne(foxName).setDrink(drinkName);
    return "redirect:/?name=" + foxName;
  }

  @GetMapping(value = "/trickCenter")
  public String trickCenterPage(@RequestParam(name = "name", required = false) String foxName, Model model) {
    model.addAttribute("foxName", foxName);
    if (Util.loggedInFox == null || foxService.findOne(foxName) == null) {
      return "redirect:/login";
    } else {
      return "trickcenter";
    }
  }

  @PostMapping (value = "/trickCenter")
  public String trickSetPage(@RequestParam(name = "name", required = false) String foxName,
                                 @ModelAttribute(name = "trickName") String trickName) {
    foxService.findOne(foxName).addTrick(trickName);
    return "redirect:/?name=" + foxName;
  }
}
