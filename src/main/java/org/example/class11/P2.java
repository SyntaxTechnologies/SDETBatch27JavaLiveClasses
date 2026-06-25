package org.example.class11;

/*
5. Change an Element

Create an ArrayList<String> called cities.

Add "Lahore", "Karachi", and "Islamabad".
Change "Karachi" to "Multan".
Print the ArrayList.
 */

import java.util.ArrayList;

public class P2 {
    static void main() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Lahore");
        cities.add("Karachi");
        cities.add("Islamabad");
        System.out.println(cities);
        cities.set(1,"Multan");
        System.out.println(cities);
    }
}
