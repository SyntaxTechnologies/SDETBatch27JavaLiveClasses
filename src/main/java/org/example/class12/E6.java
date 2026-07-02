package org.example.class12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class E6 {
    static void main() {

        Set<Integer> list=new HashSet<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(4);
        System.out.println(list);
    }
}
