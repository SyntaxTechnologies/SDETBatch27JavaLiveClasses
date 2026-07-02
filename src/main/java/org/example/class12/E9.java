package org.example.class12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E9 {
    static void main() {
        Set<String> names=new LinkedHashSet<>();
        names.add("Muhammad");
        names.add("Abu Bakar");
        names.add("Omar");
        names.add("Ali");
        names.add("Usman");
        names.add("Usman");
        names.add("Asghar");
        names.add("Asghar");
        System.out.println(names);
    }
}
