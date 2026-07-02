package org.example.class13;

public class Cat {
    String name;
    int age;

    Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
