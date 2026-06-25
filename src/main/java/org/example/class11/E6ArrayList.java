package org.example.class11;

import java.util.ArrayList;

public class E6ArrayList {
    static void main() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        System.out.println(num);
        //num.set(4,99);
        num.add(4, 99);
        System.out.println(num);
        System.out.println(num.reversed());


    }
}
