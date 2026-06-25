package org.example.class11;

import java.util.ArrayList;

public class E4ArrayList {
    static void main() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        // to remove single elements
        num.remove(0);
        System.out.println(num.get(0));
        // is used to remove multiple elements based on a criteria
        num.removeIf(x->x>30);
        System.out.println(num);


    }
}
