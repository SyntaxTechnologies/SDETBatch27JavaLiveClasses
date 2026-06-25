package org.example.class11;

import org.example.class8.BankAccount;
import org.example.class8.Dog;

import java.util.ArrayList;

public class E1ArrayList {
    static void main() {
        //ArrayList
        int [] numbers={10,20,30,40,50,77};

       // numbers[16]=70;
      //  Dog dog = new Dog();
      //  BankAccount bankAccount = new BankAccount();
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        System.out.println(num.size());
        num.add(20);
        num.add(30);
        System.out.println(num.size());
        num.add(40);
        num.add(50);
        num.add(77);
        System.out.println(num.size());
        num.add(60);
        System.out.println(num.size());



    }
}
