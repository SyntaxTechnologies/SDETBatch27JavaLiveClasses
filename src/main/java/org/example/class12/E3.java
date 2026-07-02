package org.example.class12;

import java.util.ArrayList;
import java.util.LinkedList;

public class E3 {
    static void main() {

        LinkedList<String> names=new LinkedList<>();
        names.add("Muhammad");
        names.add("Abu Bakar");
        names.add("Omar");
        names.add("Ali");
        names.add("Usman");
        names.add("Asghar");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
