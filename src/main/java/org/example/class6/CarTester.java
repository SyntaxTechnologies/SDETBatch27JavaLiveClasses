package org.example.class6;

public class CarTester {
    static void main() {

        Car car = new Car();
        car.brand="Toyota";
        car.color="Red";
        car.start();
        car.drive();
        car.stop();

        Car car2 = new Car();
        car2.brand="Honda";
        car2.color="Blue";
        car2.start();
        car2.drive();
        car2.stop();
    }
}
