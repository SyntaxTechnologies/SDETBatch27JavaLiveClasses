package org.example.class11;
/*
6. Remove an Element

Create an ArrayList<String> called animals.

Add "Cat", "Dog", "Lion".
Remove "Dog".
Print the ArrayList
 */

import java.util.ArrayList;

public class P3 {
    static void main() {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Lion");
        animals.remove("Dog");
        System.out.println(animals);
    }
}
