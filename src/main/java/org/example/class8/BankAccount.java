package org.example.class8;

import java.sql.SQLOutput;

public class BankAccount {

    // private protected public
    public static String accountTitle = "Muhammad Ahmad";
    static String userName;
    private static String password = "pass123";
    static double balance;

    private static void printPassword() {
        System.out.println(password);

    }

    static void main() {
        System.out.println(password);
        System.out.println(accountTitle);
        System.out.println(userName);

        printPassword();
    }

}
