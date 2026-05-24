package org.example.class5;
/*
Search for a Number
Store numbers in an array. Search for the number 7.
If found, print "Number found" and stop the loop using break.
 */
public class P5 {
    static void main() {

        int[] numbers={10,20,33,7,40,50,60,28};

        for(int num:numbers){
            if(num==7){
                System.out.println("Number Found");
                break;
            }
        }

    }
}
