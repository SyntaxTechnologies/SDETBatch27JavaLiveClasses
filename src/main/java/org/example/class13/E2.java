package org.example.class13;

import java.util.ArrayList;

public class E2 {
    static void main() {

        Cat c1=new Cat("Tom",10);
        Cat c2=new Cat("Jerry",15);
        Cat c3=new Cat("Tomy",2);

        ArrayList<Cat> cats=new ArrayList();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        System.out.println(cats);


    }
}
