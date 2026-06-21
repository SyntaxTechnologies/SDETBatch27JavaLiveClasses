package org.example.class10;

public class Iphone {
    void takePics(){
        System.out.println("Use cameras to take pics");
    }

    void makeVideo(){
        System.out.println("Use the cameras to make basic videos");
    }

    void browse(){
        System.out.println("Use Safari browser to browse the internet");
    }

}
class Iphone11 extends Iphone {

    @Override
    void takePics() {
        System.out.println("Use three back cameras to take better pics");
    }
}



