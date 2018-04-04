package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountWebController {

  BankAccount bankAccount;
  Bank bankAccounts = new Bank();

  @GetMapping(value = "/show")
  public String showBankAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion"));
    return "bankaccountfields";
  }

  @GetMapping(value = "/bank")
  public String showBankAccounts(Model model) {
    bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    bankAccounts.add(new BankAccount("Mufasa", 1000, "lion"));
    bankAccounts.add(new BankAccount("Pumbaa", 5700, "warthog"));
    bankAccounts.add(new BankAccount("Rafiki", 6456, "mandrill"));
    bankAccounts.add(new BankAccount("Timon", 2056, "meerkat"));
    model.addAttribute("bankAccounts", bankAccounts.getBankAccounts());
    return "bankaccounts";
  }
}
