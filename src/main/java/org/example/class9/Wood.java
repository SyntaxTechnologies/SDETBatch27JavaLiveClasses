package org.example.class9;

public class Wood {
    String name;
    String origin;
}

class Furniture extends Wood {
    String color;

}

class Chair extends Furniture{

    String typeOfChair;

    void printInfo(){
        System.out.println(name+color+origin+typeOfChair);
    }
}

class ChairTester{
    static void main() {
        Chair chair = new Chair();
        chair.name = "Oak Wood";
        chair.color = "Brown";
        chair.origin = "Canada";
        chair.typeOfChair = "Dining Chair";
        chair.printInfo();
    }
}