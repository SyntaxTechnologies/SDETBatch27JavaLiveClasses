package org.example.class3;

/*
Number Range Check
Steps
Declare an integer variable.
Store a number in it.
Check if the number is greater than 10.
If true, print "Number is greater than 10".
Inside that condition, check:
If the number is less than 50
If true, print "Number is between 10 and 50".
Otherwise, print "Number is 50 or more".
 */

public class P2 {
    static void main() {

        int number=100;

        if(number>10){
            System.out.println("Number is greater than 10");

            if(number<50){
                System.out.println("Number is between 10 and 50");
            }else{
                System.out.println("Number is 50 or more");
            }

        }

    }
}
