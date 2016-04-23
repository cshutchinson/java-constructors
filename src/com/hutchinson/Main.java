package com.hutchinson;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("244785");
        account.setBalance(100.00f);
        account.setCustomerName("Christopher Hutchinson");
        account.setEmail("cshutchinson@gmail.com");
        account.setPhoneNumber("(720) 980-1526");

        System.out.println("Account");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone: " + account.getPhoneNumber());

        System.out.println("Deposit $100.00");
        System.out.println(account.deposit(100.00));

        System.out.println("Withdraw $50.00");
        System.out.println(account.withdraw(50.00));

        System.out.println("Withdraw $200.00");
        System.out.println(account.withdraw(200.00));

    }
}
