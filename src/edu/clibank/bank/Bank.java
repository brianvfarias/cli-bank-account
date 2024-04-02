package edu.clibank.bank;

public class Bank {
  private String user;
  private double funds;
  private int accountNumber;
  private String agency;

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public double getFunds() {
    return funds;
  }

  public void setFunds(double funds) {
    this.funds = funds;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  // public Bank getBankInfo() {
  // }

  public Bank(String user, double funds, int accountNumber, String agency) {
    this.user = user;
    this.funds = funds;
    this.accountNumber = accountNumber;
    this.agency = agency;
  }

  public int withdraw(double amount) {
    if (this.funds == 0 || this.funds < amount) {
      System.out.println("You don't have enough funds to make this transaction");
      return 0;
    }
    this.funds = this.funds - amount;
    System.out.println("You have withdrawn " + amount + "!" + "Your current funds are " + this.funds + ".");
    return 1;
  }

  public int deposit(double amount) {
    this.funds = this.funds + amount;
    System.out.println("You have deposited " + amount + "!" + "Your current funds are " + this.funds + ".");
    return 1;
  }

}
