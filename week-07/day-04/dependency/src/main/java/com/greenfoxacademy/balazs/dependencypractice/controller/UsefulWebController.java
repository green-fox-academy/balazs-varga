package com.greenfoxacademy.balazs.dependencypractice.controller;

import com.greenfoxacademy.balazs.dependencypractice.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulWebController {

  @Autowired
  UtilityService utilityService;

  @GetMapping(value = "/useful")
  public String linkToUtilities() {
    return "links_to_utilities";
  }

  @GetMapping(value = "/useful/colored")
  public String colouredBackground(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "coloured_background";
  }

  @GetMapping(value = "/useful/email")
  public String validateEmail(Model model) {
    return "email_validator";
  }
}
