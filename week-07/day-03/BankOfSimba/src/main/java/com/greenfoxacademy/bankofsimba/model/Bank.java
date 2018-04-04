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
    bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    bankAccounts.add(new BankAccount("Mufasa", 1000, "lion"));
    bankAccounts.add(new BankAccount("Pumbaa", 5700, "warthog"));
    bankAccounts.add(new BankAccount("Rafiki", 6456, "mandrill"));
    bankAccounts.add(new BankAccount("Timon", 2056, "meerkat"));
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
