package org.example.class12;

import java.util.ArrayList;

public class E1 {
    static void main() {
        ArrayList<String> names=new ArrayList<>();
        names.add("Muhammad");
        names.add("Abu Bakar");
        names.add("Omar");
        names.add("Ali");
        names.add("Usman");
        names.add("Asghar");
        for(String name:names){
            System.out.println(name);
        }

    }
}
