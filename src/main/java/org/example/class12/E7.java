package org.example.class12;

import java.util.HashSet;
import java.util.Set;

public class E7 {
    static void main() {

        Set<String> list=new HashSet<>();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       list.add("D");
       list.add("D");
        System.out.println(list);
    }
}
