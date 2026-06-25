package org.example.class11;

import java.util.ArrayList;

/*
. Loop Through an ArrayList

Create an ArrayList<String> called cars.

Add 4 car names.
Use a for loop to print each car.
 */
public class P6 {
    static void main() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Volkswagen");
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("***************");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}
