package org.example.class8;

public class E3ThisKeyword {

    String color="Red";

    void printColor(){
        String color="Blue";
        System.out.println(color);
        System.out.println(this.color);
    }
}
