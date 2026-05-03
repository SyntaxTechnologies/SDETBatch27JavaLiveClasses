package org.example.class2;

public class E23ElseIf {
    static void main() {

        String fruit="Mango";

        if(fruit.equals("Banana")){
            System.out.println("Yellow Fruit");
        } else if (fruit.equals("Kiwi")) {
            System.out.println("Green Fruit");
        }else if(fruit.equals("Cherry")){
            System.out.println("Red Fruit");
        } else if (fruit.equals("BlueBerry")) {
            System.out.println("Blue Fruit");
        }else{
            System.out.println("Fruit color not recognized");
        }

    }
}
