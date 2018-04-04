package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<BankAccount> bankAccounts;

  public Bank() {
    bankAccounts = new ArrayList<>();
  }

  public void add(BankAccount bankAccount) {
    bankAccounts.add(bankAccount);
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }
}
