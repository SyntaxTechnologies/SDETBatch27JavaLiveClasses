package org.example.class6;

public class BankAccount {

    String userName;
    String password;
    String accountTitle;


    void login(){
        System.out.println("Please enter your userName and password to login");
    }

    void logout(){
        System.out.println("You have been logged out");
    }

    void transferMoney(){
        System.out.println("Please enter your amount to transfer and account number ");
    }
}
