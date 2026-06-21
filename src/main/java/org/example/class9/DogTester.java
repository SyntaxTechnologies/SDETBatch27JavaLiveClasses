package org.example.class9;

public class DogTester {
    static void main() {

        Dog d = new Dog();
        d.name = "Jack";
        d.age=12;
        d.color="Black";
        d.weight=1.5;
        d.printName();
        d.printInfo();
        d.speak();
    }
}
