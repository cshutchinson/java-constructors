package com.hutchinson;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String deposit(double amount){
        this.balance += amount;
        return "Balance $" + this.balance;
    }

    public String withdraw(double amount){
        if (amount > balance){
            return "Insufficient funds for withdrawal of $" + amount;
        }
        this.balance -= amount;
        return "Balance $" + this.balance;
    }

}
