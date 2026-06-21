package org.example.class8;

public class Mobile {

    // Instance Variables
    String model;
    double price;
    //Constructor
    Mobile(String model,double price){
        this.model=model;
        this.price=price;
    }
    // Simple Method
    void printInfo(){
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }

}
