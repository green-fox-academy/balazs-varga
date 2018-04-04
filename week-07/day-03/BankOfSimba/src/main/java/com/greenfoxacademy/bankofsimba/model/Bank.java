package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<BankAccount> bankAccounts;

  public Bank() {
    bankAccounts = new ArrayList<>();
    fill();
  }

  private void fill() {
    bankAccounts.add(new BankAccount("Simba", 2000, "lion", false, true));
    bankAccounts.add(new BankAccount("Mufasa", 1000, "lion", false, true));
    bankAccounts.add(new BankAccount("Pumbaa", 5700, "warthog", false, true));
    bankAccounts.add(new BankAccount("Rafiki", 6456, "mandrill", false, false));
    bankAccounts.add(new BankAccount("Timon", 2056, "meerkat", false, true));
    bankAccounts.add(new BankAccount("Lion King", 99999, "lion", true, true));
  }

  public void add(BankAccount bankAccount) {
    bankAccounts.add(bankAccount);
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  @Override
  public String toString() {
    return "Bank{" +
            "bankAccounts=" + bankAccounts +
            '}';
  }
}
