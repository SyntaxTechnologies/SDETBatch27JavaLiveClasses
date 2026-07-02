package org.example.class12;

import java.util.Set;
import java.util.TreeSet;

public class E11 {
    static void main() {
        Set<Integer> number=new TreeSet<>();
        number.add(6);
        number.add(5);
        number.add(4);
        number.add(3);
        number.add(2);
        number.add(2);

        for(Integer i:number){
            System.out.println(i);
        }

        for (int i = 0; i < number.size(); i++) {
           // System.out.println(number.get(i));

        }

    }
}
