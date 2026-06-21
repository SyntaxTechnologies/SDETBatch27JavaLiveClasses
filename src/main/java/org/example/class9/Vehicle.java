package org.example.class9;

public class Vehicle {
    private String regNumber;
    String color;
   public int modelYear;

}

class Car extends Vehicle{

    void printInfo(){
        // we can't access private fields
      //  System.out.println(regNumber);
        System.out.println(color);
        System.out.println(modelYear);
    }
}

