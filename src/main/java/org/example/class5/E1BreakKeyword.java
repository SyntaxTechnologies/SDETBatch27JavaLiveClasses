package org.example.class5;

public class E1BreakKeyword {
    static void main() {

        // write a piece of code to check if number 33 is present or not
        // if java sees the number 33 print 33 is present
        int[] numbers={10,20,33,40,50,60,28};

        for(int i=0;i<numbers.length;i++){

            if(numbers[i]==33){
                System.out.println("Number 33 is present in this Array");
                break;
            }
        }
    }
}
