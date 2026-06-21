package org.example.class8;

public class Cat {
    private String name;
    private String color;
    private int age;

    Cat(String catName, String catColor, int catAge) {
        name = catName;
        color = catColor;
        age = catAge;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}
