package org.example.class9;

public class GrandParent {
    int age=100;
}
class Parent extends GrandParent{
    int age=40;
}
class Child extends Parent{
    int age=5;

    void printAge(){
        System.out.println(age);
    }
}

class SuperTester{
    static void main() {
        Child child = new Child();
        child.printAge();
    }
}