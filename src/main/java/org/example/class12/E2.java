package org.example.class12;

import java.util.ArrayList;

public class E2 {
    static void main() {
        ArrayList<String> names=new ArrayList<>();
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
