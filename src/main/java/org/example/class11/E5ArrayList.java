package org.example.class11;

import java.util.ArrayList;

public class E5ArrayList {
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
        num.addFirst(100);
        System.out.println(num);
        num.clear();
        System.out.println(num);



    }
}
