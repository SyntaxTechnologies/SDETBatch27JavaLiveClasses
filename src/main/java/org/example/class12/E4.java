package org.example.class12;

import java.util.LinkedList;
import java.util.List;

public class E4 {
    static void main() {

        List<String> names=new LinkedList<>();
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
