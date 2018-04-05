package com.greenfoxacademy.balazs.dependencypractice.controllers;

import com.greenfoxacademy.balazs.dependencypractice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxWebController {

  private StudentService studentService;

  @Autowired
  public GreenFoxWebController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(value = "/gfa")
  public String linkToGfaPages() {
    return "gfa_pages";
  }

  @GetMapping(value = "/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "gfa_students";
  }
}
