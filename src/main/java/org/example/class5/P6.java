package org.example.class5;
/*
Create a while(true) loop that prints numbers starting
from 1 and stops when the number reaches 25 using break.
 */
public class P6 {
    static void main() {


        int number=1;
        while (true){
            System.out.println(number);
            if(number==25){
                break;
            }
            number++;
        }
    }
}
