package org.example.class9;

public class Printer {
    void print(){
        System.out.println("hello");
    }

    void print(String message){
        System.out.println(message);
    }

    void print(String message, int times){
       for(int i=0;i<times;i++){
           System.out.println(message);
       }
    }
}
