package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountWebController {

  BankAccount bankAccount;
  Bank bankAccounts = new Bank();

  @GetMapping(value = "/show")
  public String showBankAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", false, true));
    return "bank_account_fields";
  }

  @GetMapping(value = "/bank")
  public String showBankAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccounts.getBankAccounts());
    return "bank_accounts";
  }

  @PostMapping(value = "/balanceUpdate")
  public String updateBalance(@ModelAttribute(name = "accountName") String accountName) {
    bankAccounts.getBankAccount(accountName).updateBalance();
    return "redirect:/bank";
  }
}
