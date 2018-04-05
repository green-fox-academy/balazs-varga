package com.greenfoxacademy.balazs.dependencypractice.controllers;

import com.greenfoxacademy.balazs.dependencypractice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxWebController {

  private StudentService studentService;

  @Autowired
  public GreenFoxWebController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(value = "/gfa")
  public String linkToGfaPages(Model model) {
    model.addAttribute("studentCount", studentService.count());
    return "gfa_pages";
  }

  @GetMapping(value = "/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "gfa_students";
  }

  @GetMapping(value = "/gfa/add")
  public String addNewStudent() {
    return "gfa_add_new_student";
  }

  @PostMapping(value = "/gfa/save")
  public String save(@ModelAttribute(name = "studentName") String studentName) {
    studentService.save(studentName);
    return "redirect:/gfa";
  }

  @GetMapping(value = "/gfa/check")
  public String checkStudent(Model model, @ModelAttribute(name = "studentName") String studentName) {
    if (!studentName.equals("")) {
      if (studentService.check(studentName)) {
        model.addAttribute("isStudentInList", studentName + " is in the list.");
      } else {
        model.addAttribute("isStudentInList", studentName + " is not in the list.");
      }
    }
    return "gfa_check_student";
  }
}
