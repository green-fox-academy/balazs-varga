package com.greenfoxacademy.balazs.dependencypractice.controllers;

import com.greenfoxacademy.balazs.dependencypractice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulWebController {

  private UtilityService utilityService;

  @Autowired
  public UsefulWebController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

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
  public String emailValidator(Model model, @RequestParam(name = "email") String email) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("isValidEmail", email + " is a valid email address");
      model.addAttribute("color", "color:green");
    } else {
      model.addAttribute("isValidEmail", email + " is not a valid email address");
      model.addAttribute("color", "color:red");
    }
    return "email_validator";
  }

  @GetMapping(value = "/useful/caesarEncoder")
  public String caesarEncoder(Model model, @RequestParam(name = "text") String word, @RequestParam(name = "number") int number) {
    model.addAttribute("caesarCoder", utilityService.caesar(word, number));
    return "caesar_coder";
  }

  @GetMapping(value = "/useful/caesarDecoder")
  public String caesarDecoder(Model model, @RequestParam(name = "text") String word, @RequestParam(name = "number") int number) {
    model.addAttribute("caesarCoder", utilityService.caesar(word, -number));
    return "caesar_coder";
  }
}
